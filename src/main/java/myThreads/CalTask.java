package myThreads;

import java.util.concurrent.RecursiveTask;

public class CalTask extends RecursiveTask<Integer> {

	private static final int Threshold = 20;
	private int arr[];
	private int start;
	private int end;
	
	public CalTask(int[] arr, int start ,int end){
		this.arr=arr;
		this.start=start;
		this.end=end;
	}
	
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub

		int sum = 0;
		if(end-start<Threshold){
			for(int i=start;i<end;i++){
				sum+=arr[i];
			}
			return sum;
		}
		else
		{
			int middle=(start+end)/2;
			CalTask left = new CalTask(arr,start,middle);
			CalTask right = new CalTask(arr,middle,end);
			// 并行执行
			left.fork();
			right.fork();
			return left.join()+right.join();
		}
		
		
	}

}
