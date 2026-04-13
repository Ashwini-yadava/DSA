package com.gqt;

class Demo {
	public static void m1() {
		System.out.println("hi hello byeeee.....");
		m1();

	}
}

public class StactOverflowError {

	public static void main(String[] args) {
		Demo.m1();

	}

}
