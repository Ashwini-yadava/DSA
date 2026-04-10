package com.gqt;

import java.util.Scanner;

class Demo9 {
	public static void test(int n) {
		int factors = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					factors++;
				}
				
			}
			if(factors==2) {
				System.out.println(i+"is a prime number");
			}
			else {
				System.out.println(i+"is not a prime number");
			}
			factors=0;
		}
	}
}

public class CheckPrimeOfNNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		Demo9.test(n);
		
	}

}
