package com.javaex.ex17;

public class Shape {

	public static void main(String[] args) {

		Ractangle[] rArray = new Ractangle[3];

		Ractangle r01 = new Ractangle(5, 10, "파랑", "빨강");
		Ractangle r02 = new Ractangle(6, 20, "검정", "노랑");
		Ractangle r03 = new Ractangle(4, 8, "빨강", "주황");

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		Triangle[] tArray = new Triangle[3];

		Triangle t01 = new Triangle(20, 5, "노랑", "초록");
		Triangle t02 = new Triangle(10, 7, "노랑", "초록");
		Triangle t03 = new Triangle(15, 9, "노랑", "초록");

		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}

		Circle[] cArray = new Circle[3];

		Circle c01 = new Circle(6, "남색", "노랑");
		Circle c02 = new Circle(9, "파랑", "초록");
		Circle c03 = new Circle(7, "검정", "흰색");

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

	}

}
