package com.javaex.ex19;

public class Shape {

	// 필드
	private String fillColor, LineColor;

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

}
