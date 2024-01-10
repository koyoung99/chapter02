package com.javaex.ex21;

public class Circle extends Shape implements Drawable{

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

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}

	public void draw() {
		// 원을 시각화 하는 복잡한 로직작동
		System.out.println("======원을 그렸습니다=========");
		System.out.println("반지름:" + radius);
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("============================");
	}

	@Override
	public double area() {
		return 3.14 * radius * radius;
	}

}
