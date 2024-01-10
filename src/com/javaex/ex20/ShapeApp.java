package com.javaex.ex20;

public abstract class ShapeApp {

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
			sArray[i].draw();
		}

		// 사각형의 가로값 가져오기
		System.out.print("사각형의 가로 값 =");
		System.out.println(((Ractangle) sArray[0]).getWidth());

		// 원의 반지름 가져오기
		System.out.print("원의 반지름 값 =");
		System.out.println(((Circle) sArray[2]).getRadius());

		System.out.println("============================");

		// 배열 면적 가져오기
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}

		System.out.println("============================");

	}
}
