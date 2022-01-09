package com.te.excep;

public class Program4 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[7] = 5;
//			for (int i = 0; i < a.length; i++) {
//
//				System.out.println(a[i]);
//
//			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("Exception handled  ");
			System.out.println(e.getMessage());
		}

	}

}
