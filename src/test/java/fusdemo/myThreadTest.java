package fusdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import myThreads.myThread;

public class myThreadTest {

	@Test
	public void mythread(){
		//创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
		 ExecutorService execpool = Executors.newFixedThreadPool(3);
		 execpool.submit(new myThread());
		 execpool.submit(new myThread());

		 execpool.submit(new myThread());
		 execpool.submit(new myThread());
		 execpool.submit(new myThread());
		 execpool.submit(new myThread());
		 
		 execpool.shutdown();
		 
		 //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
		 ExecutorService cachepool= Executors.newCachedThreadPool();
		 cachepool.submit(new myThread());
		 cachepool.submit(new myThread());
		 cachepool.submit(new myThread());
		 cachepool.shutdown();
		 
		 
		 
		 
		 
		 
	}
	

}
