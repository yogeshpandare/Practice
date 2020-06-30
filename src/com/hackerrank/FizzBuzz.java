package com.hackerrank;

public class FizzBuzz {

	public void getTheNumberDetails(int n) {

		if (n <= 0) {
			System.out.println("Please enter a number above 0");
		} else if (n >= 200000) {
			System.out.println("Please enter a number below 200000");
		} else {
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}

	}
	public static void main(String[] args) {

		FizzBuzz fb = new FizzBuzz();
		fb.getTheNumberDetails(100000);

	}

}
