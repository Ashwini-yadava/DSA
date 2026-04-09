package com.gqt;

import java.util.Scanner;

class Demo1{ 
	public static void reverseNumber(int n) {
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = r + (rev * 10);
			n = n / 10;

		}
		System.out.println("reverse = " + rev);
	}
}

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		Demo1.reverseNumber(n);
	}
}
