package com.gqt;

import java.util.Scanner;

class Demo {
	public static void printLastDigit(int n) {
		System.out.println("last digit = " + (n % 10));
		System.out.println("Except last digit =" + (n / 10));
	}
}

public class PrintLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		Demo.printLastDigit(n);
	}

}
