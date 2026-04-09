package com.gqt;

import java.util.Scanner;

class Demo13 {
	public static void sumOfIndividualNumbers(int n) {
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = r + sum;
			n = n / 10;
		}
		System.out.println("\nsum of the individual digit" + " "+sum);

	}
}

public class SumOfIndividualdigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any digits:");
		int n = scan.nextInt();
		Demo13.sumOfIndividualNumbers(n);
	}

}
