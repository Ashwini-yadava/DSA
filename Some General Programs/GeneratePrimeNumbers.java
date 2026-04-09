package com.gqt;

import java.util.Scanner;

class Demo10 {
	public static void generateNumber(int n) {
		int factors = 0;
		System.out.println("enter numbers up to " + n + ":");
		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factors++;
				}

			}
			if (factors == 2) {
				System.out.print(i + " ");
			}
			factors = 0;
		}
	}
}

public class GeneratePrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		Demo10.generateNumber(n);

	}
}
