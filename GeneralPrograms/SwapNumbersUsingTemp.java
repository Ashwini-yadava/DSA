package com.gqt;

import java.util.Scanner;

class Demo4 {
	public static void swapNumbers(int a, int b) {
		System.out.println("before swapping:");
		System.out.println("-----------------");
		System.out.println("a = " + a + "\t b = " + b);
		// swapping logic
		int temp = 0;
		temp = a;
		a = b;
		b = temp;

		System.out.println("after swapping:");
		System.out.println("--------------");
		System.out.println("a = " + a + " \tb = " + b);
	}
}

public class SwapNumbersUsingTemp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number:");
		int b = scan.nextInt();
		Demo4.swapNumbers(a, b);

	}

}
