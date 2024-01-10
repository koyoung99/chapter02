package com.javaex.ex20;

public abstract class Shape implements Drawable {

	// 필드
	protected String fillColor, LineColor;

	// 생성자
	public Shape() {

	}

	// 메소드(g/s)
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		LineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		LineColor = lineColor;
	}

	// 메소드(일반)
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", LineColor=" + LineColor + "]";
	}

	public void draw() {
		System.out.println("Shape.draw()");
	}

	// 면적구하는 테스트
	public abstract double area();
}
