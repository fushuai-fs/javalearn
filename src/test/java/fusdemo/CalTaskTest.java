package fusdemo;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import org.junit.Test;

import myThreads.CalTask;

public class CalTaskTest {

	@Test
	public void test() throws Exception{
		int[] arr = new int[300];
		Random rand = new Random();
		
		int total=0;
		for(int i=0,len=arr.length;i<len;i++){
			int tmp= rand.nextInt(20);
			total += (arr[i]=tmp);
		}
		System.out.println(total);
		
		ForkJoinPool pool = new ForkJoinPool();
		
		Future<Integer> future = pool.submit(new CalTask(arr,0,arr.length));
		
		System.out.println(future.get());
		
		pool.shutdown();
		
	}
}
