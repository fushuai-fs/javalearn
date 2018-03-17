package myThreads;

import java.lang.Runnable;

public class myThread implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"的i="+ i);
			
		}
		 
	}

}
