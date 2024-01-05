package com.javaex.ex09;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(5, 5);
		Point p2 = new Point(10, 23);

		p1.draw(true);
		p2.draw(true);
		p1.draw(false);
		p2.draw(false);
	}

}
