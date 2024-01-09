package com.javaex.ex18;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("=============원=============");
		System.out.println("반지름:" + radius + ", 면색:" + getFillColor() + ", 선색:" + getLineColor());

	}

}
