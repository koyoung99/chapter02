package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {

		Drawable[] drawArray = new Drawable[4];
		Drawable d01 = new Ractangle(100, 100, "빨강", "빨강");
		Drawable d02 = new Tringle(50, 50, "노랑", "노랑");
		Drawable d03 = new Circle(70, "초록", "초록");
		Drawable d04 = new Point(10, 10);

		drawArray[0] = d01; // 사각형
		drawArray[1] = d02; // 삼각형
		drawArray[2] = d03; // 원
		drawArray[3] = d04; // 점

		for (int i = 0; i < drawArray.length; i++) {
			drawArray[i].draw();
		}

		// 사각형의 가로
		System.out.println(((Ractangle) drawArray[0]).getWidth());

		// 원의 넓이
		System.out.println(((Circle) drawArray[2]).area());

		// x좌표
		System.out.println(((Point) drawArray[3]).getX());

		// 삼각형의 세로
		System.out.println(((Tringle) drawArray[1]).getHeight());

		System.out.println("============================");

		// 전체에서 도형의 넓이를 출력
		for (int i = 0; i < drawArray.length; i++) {

			// 현재 배열에 방(주소)를 따라가면 Shape이 있으면
			if (drawArray[i] instanceof Shape) {
				System.out.println(((Shape) drawArray[i]).area());
			}
		}
	}
}
