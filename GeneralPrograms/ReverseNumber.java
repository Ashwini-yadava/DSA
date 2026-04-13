package com.gqt;

import java.util.Scanner;

class Test1 {
	public static void m2(int n) {
		int r = 0;
		int rev = 0;

		while (n > 0) {
			r = n % 10;
			rev = r + (rev * 10);
			n = n / 10;
		}
		System.out.println("Reverse of " + n + " is : " + rev);
	}
}

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = scan.nextInt();
		Test1.m2(n);
	}
}