package com.gqt;

import java.util.Scanner;

class Demo3 {
	public static void checkpalindrom(int n) {
		int n1=n;
		int r=0;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev=r+(rev*10);
			n=n/10;
		}
		if(rev==n1) {
			System.out.println(n1+" is a Palindrome");
		}else {
			System.out.println(n1+" is not a palindrome");
		}

	}
}

public class CheckPalindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number:");
		int n = scan.nextInt();
		Demo3.checkpalindrom(n);

	}

}
