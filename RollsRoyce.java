package com.te.factorymethod;

public class RollsRoyce implements Car {
	
	@Override
	public void start() {
		System.out.println("Baammm");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Zuuuuuuuuuuuuu");
		
	}

	@Override
	public void brake() {
		System.out.println("Hoooooooooo");
		
	}
	
	
	

}
