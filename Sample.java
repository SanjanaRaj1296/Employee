package com.te.prac;

public class Sample {

	public static void main(String[] args) {

		try {
			try {

				double result = 1 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception!!!");
			}
			int arr[] = { 1, 2, 3 };
			int a = arr[4];

		}

		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array exception!!!");
		}

	}
}
