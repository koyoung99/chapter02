package com.javaex.Ex09;

public class Point {

	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "Point(int x, int y)";
	}

	public void draw() {
		System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");
	}

	public void draw(boolean action) {
		if (action == true) {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");
		} else {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 지웠습니다.");
		}
	}

}
