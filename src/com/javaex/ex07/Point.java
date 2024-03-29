package com.javaex.ex07;

public class Point {

	// 필드
	private int x, y;

	// 생성자
	public Point() {
		System.out.println("this()");
	}

	public Point(int x) {
		this.x = x;
		System.out.println("this(x)");
	}

	public Point(int x, int y) {
		this(x);
		this.y = y;
		System.out.println("y값 추가");
	}

	// 메소드(g/s)
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// 메소드(일반)

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
