package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[3];

		Shape s01 = new Ractangle(2, 2, "빨강", "초록");

		Shape s02 = new Tringle(3, 5, "노랑", "파랑");

		Shape s03 = new Circle(4, "초록", "주황");

//		Ractangle r01=new Ractangle(2,5, "노랑", "연두");

//		부모만 보인다. 자식쪽은 사용못함

		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;

		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].toString());
		}

	}

}
