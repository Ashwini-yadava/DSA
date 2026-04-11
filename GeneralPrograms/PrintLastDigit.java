package com.gqt;

import java.util.Scanner;

class Test{
	public static void printLastDigit(int n) {
		System.out.println("enter last digit:"+(n%10));
		System.out.println("enter except last digit:"+(n/10));
	}
}

public class PrintLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		Test.printLastDigit(n);

	}

}
