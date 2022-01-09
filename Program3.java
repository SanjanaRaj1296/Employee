package com.te.excep;

public class Program3 {
	public static void main(String[] args) {

		try {
			String s = "sanjay";

			int x = Integer.parseInt(s);
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
//			String str = e.getMessage();
//			System.out.println(str);
		}
	}
}
