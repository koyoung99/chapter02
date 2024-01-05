package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(5);
		p1.setY(8);
		System.out.println(p1);

		Point p2 = new Point(3);
		p1.setY(9);
		System.out.println(p2);

		Point p3 = new Point(5, 4);
		System.out.println(p3);

	}

}
