package com.javaex.ex21;

public class Tringle extends Shape implements Drawable {

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
		// 삼각형을 시각화 하는 복잡한 로직작동
		System.out.println("====삼각형을 그렸습니다=========");
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("============================");
	}

	@Override
	public double area() {
		return width * height;
	}

}
