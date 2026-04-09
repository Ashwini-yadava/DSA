package com.gqt;

import java.util.Scanner;

class Demo6 {
	public static void findFactorial(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		System.out.println(n+ " ! =  " + fact);
		
}
}
public class FindFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any positive number:");
		int n = scan.nextInt();
		if(n<0){
			System.out.println("finding factorial is not posible please enter positive number");
		}
		else {
			Demo6.findFactorial(n);
		}
				
		

	}
}


