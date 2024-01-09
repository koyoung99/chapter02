package com.javaex.ex19;

public class Tringle extends Shape {

	private int width, height;

	public Tringle() {
		super();
	}

	public Tringle(int width, int height, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tringle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

	public void draw() {
		System.out.println("=============삼각형=============");
		System.out.println("가로:" + width + ", 높이:" + height + ", 면색:" + getFillColor() + ", 선색:" + getLineColor());

	}

}
