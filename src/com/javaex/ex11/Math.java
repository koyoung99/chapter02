package com.javaex.ex11;

public class Math {

	public int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public double plus(double a, int b) {
		double sum = a + b;
		return sum;
	}

	public double plus(int a, double b) {
		double sum = a + b;
		return sum;
	}

	public double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}

	public String plus(String a, double b) {
		String sum = a;
		for (int i = 1; i < b; i++) {
			sum += a;
		}
		return sum;
	}

}
