package com.te.factorymethod;

import java.util.Scanner;

public class Owner {
	
	public static void main(String[] args)
	{
		Driver driver = new Driver();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Shreyas Boss which car shud I bring");
		
		String s = sc.next();
		driver.driver(s);
		
		
	}

}
