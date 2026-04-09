package com.gqt;

import java.util.Scanner;

class DemoPrime {
	public static void generatePrimes(int n) {
		int count = 0; // how many primes found
		int num = 2; // start from first prime number

		while (count < n) {
			int factors = 0;

			// check factors
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					factors++;
				}
			}

			// if prime
			if (factors == 2) {
				System.out.print(num + " ");
				count++;
			}

			num++; // move to next number
		}
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter value of n: ");
		int n = scan.nextInt();

		DemoPrime.generatePrimes(n);
	}
}
