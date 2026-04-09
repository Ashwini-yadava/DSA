package com.gqt;

import java.util.Scanner;

class Demo14 {
	public static int maximumElementPresentInAnArray(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}

public class MaximumElementPresentInAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array of an element:");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("enter"+size+"element:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();		
			}
		int result = Demo14.maximumElementPresentInAnArray(arr);
		System.out.println("maximum element:"+ result);

	}
}
