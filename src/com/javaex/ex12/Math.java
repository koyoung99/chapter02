package com.javaex.ex12;

public class Math {

	private final static double PI = 3.14; //

	public static int plus(int a, int b) {
		return a + b;
	}

	public static double plus(double a, int b) {
		return a + b;
	}

	public static double plus(int a, double b) {
		return a + b;
	}

	public static double plus(double a, double b) {
		return a + b;
	}

	public static double CircleArea(int redius) {
		return PI * redius * redius;
	}
}
