package com.gqt;

import java.util.Scanner;

class Demo8 {
	public static void isPrimeOrNot(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors++;
			}
		}
		if(factors==2) {
			System.out.println(n+"is a prime");
		}
		else {
			System.out.println(n+"is not a prime");
		}

	}
}

public class IsPrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		Demo8.isPrimeOrNot(n);

	}

}
