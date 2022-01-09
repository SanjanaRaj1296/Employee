 package com.te.custom;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		int x = sc.nextInt();

		try {
			if (x >= 100) {
				throw new InvalidInputException("Exception");
			} else {
				System.out.println("Valid");
			}
		} catch (InvalidInputException e) {
			System.out.println("Exception caught");
			System.out.println("Number is greater than 100");

		}
	}

}
