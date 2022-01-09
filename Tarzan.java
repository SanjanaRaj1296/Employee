package com.te.factorymethod;

public class Tarzan implements Car {
	
	@Override
	public void start() {
		System.out.println("Tarzaaannnnnn");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Weeeeeeeee");
		
	}

	@Override
	public void brake() {
		System.out.println("Tuk Tuk");
		
	}
	

}
