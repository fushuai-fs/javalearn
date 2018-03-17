package myThreads;

import java.util.concurrent.Callable;

public class myCallable implements Callable {

	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int result =0;
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"的i="+ i);
			result=result+i;
			
		}
		
		return result;
		
	}


}
