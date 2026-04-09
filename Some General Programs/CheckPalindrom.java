package com.gqt;

import java.util.Scanner;

class Demo3 {
	public static void checkpalindrom(int n) {
		int n1 = n;
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = r + (rev * 10);
			n = n / 10;

		}
		System.out.println("reverse =" + rev);
		if (rev == n1) {
			System.out.println(n1 + "is a palindrome");
		} else {
			System.out.println(n1 + "\tis not a palindromeṁ");
		}

	}
}

public class CheckPalindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		Demo3.checkpalindrom(n);

	}

}
