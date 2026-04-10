package com.gqt;

import java.util.Scanner;

class Demo12 {
	public static void tribonacciSeries(int n) {
		int trib1 = 0;
		int trib2 = 0;
		int trib3 = 1;
		int trib;
		System.out.println("\n enter the tribonacci up tp" + n + ":");
		System.out.println("-------------");
		System.out.print(trib1 + " " + trib2 + " " + trib3 + "");
		for (int i = 4; i <= n; i++) {
			trib = trib1 + trib2 + trib3;
			System.out.print( " "+trib + " ");
			trib1 = trib2;
			trib2 = trib3;
			trib3 = trib;
		}

	}
}

public class TribonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = scan.nextInt();
		Demo12.tribonacciSeries(n);

	}

}
