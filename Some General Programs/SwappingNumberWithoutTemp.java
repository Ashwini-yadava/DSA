package com.gqt;

import java.util.Scanner;

class Demo5 {
	public static void withoutTemp(int a, int b) {
		System.out.println("Before swapping:");
		System.out.println("----------------");
		System.out.println("a = " + a + "\t b = " + b);

		// swapping logic
		// a = a + b;
		// b = a - b;
		// a = a - b;
		
		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println("After swapping:");
		System.out.println("---------------");
		System.out.println("a = " + a + " \t b = " + b);

	}

}

public class SwappingNumberWithoutTemp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number");
		int b = scan.nextInt();
		Demo5.withoutTemp(a, b);

	}

}
