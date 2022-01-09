package com.te.excep;

public class Program2 {

	public static void main(String[] args) {

		try {
			int a = 12;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Infinite");
			System.out.println(e.getMessage());
		}

	}

}
