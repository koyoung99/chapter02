package com.javaex.ex19;

public class Ractangle extends Shape {

	// 필드
	private int width, height;

	// 생성자 - 메모리에 올리는일
	public Ractangle() {
//		super();
	}

	public Ractangle(int width, int height, String fillColor, String lineColor) {
//		super();
//		super.setFillColor(fillColor);
//		super.setLineColor(lineColor);

		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드(g/s)
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

	// 메소드(일반)

	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("====사각형을 그렸습니다=========");
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("============================");
	}

}
