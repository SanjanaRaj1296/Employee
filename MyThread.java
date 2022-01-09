package com.te.runnableinter;

public class MyThread implements Runnable{
	
	public void run() {
		System.out.println("The name of the current thread from runnable is:"+Thread.currentThread().getName());
		System.out.println("The thread id is:"+Thread.currentThread().getId());
		
		//for (int i=0;i<10;i++) {
			//System.out.println(i);
			//try {
				//Thread.sleep(1000);
			//} 
			//catch (InterruptedException e) {
		
			}
		
	}


