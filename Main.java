package com.te.runnableinter;

public class Main {
	public static void main(String[] args) {
		Runnable myThread=new MyThread();
		
		System.out.println("The name of the current thread is:"+curre);
		Thread currentThread=Thread.currentThread();
		
		// The code to set the name of the thread
		currentThread.setName("Chotta Bheem");
		System.out.println("The name of the current thread is:"+currentThread.getName());
		Thread thread =new Thread(myThread);
		thread.setName("Chutki");
		thread.start();
	
		//The code for id
		
		System.out.println("The thread id is:"+currentThread.getId());
		
		
		//System.out.println("Program is running");
	}

}
