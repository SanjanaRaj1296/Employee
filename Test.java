package com.te.test;


public class Test {
	public static void m1(int a, int b) {
		System.out.println("method-1");

	}

	public static void m1(int b, String s) {
		System.out.println("method-2");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10, 20);
		t.m1(20, "manju");
		System.out.println(t);

	}


}
