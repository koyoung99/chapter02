package com.javaex.ex15;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {

	}

	public ColorPoint(String color) {
		super();
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}

	public void showInfo() {
		System.out.println("점 x=" + super.x + ", y=" + super.y+", 색:"+this.color );
	}

}
