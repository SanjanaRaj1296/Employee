package com.te.excep;

public class Program1 {
	public static void main(String[] args) {
		try {

			String str = null;

			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Exception handled");
		}
	}
}
