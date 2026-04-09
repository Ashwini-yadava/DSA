package com.gqt;

import java.util.Scanner;

class Demo11 {
	public static void fibonacciSeries(int n) {
		int fib1 = 0;
		int fib2 = 1;
		int fib;
		System.out.println("\n Enter fibonacci up to" + n + ":");
		System.out.println("--------------");
		System.out.print(fib1 + " " + fib2 + " ");
		for (int i = 3; i <= n; i++) {
			fib = fib1 + fib2;
			System.out.print(fib + " ");
			fib1 = fib2;
			fib2 = fib;

		}

	}
}

public class FibonccciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		Demo11.fibonacciSeries(n);

	}

}
