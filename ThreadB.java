package com.te.syn2;

public class ThreadB extends Thread {

	public  synchronized  void run() {
		

		for (int i = 11; i <= 20; i++) {
			
			System.out.println(i);
			
		}
		
	}

}
