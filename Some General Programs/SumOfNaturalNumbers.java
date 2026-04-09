package com.gqt;

import java.util.Scanner;

class Demo7 {
	public static void sumOfNaturalNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of the natural numbers" + n + " = " + sum);

	}
}

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of n:");
		int n = scan.nextInt();
		Demo7.sumOfNaturalNumbers(n);

	}

}
