package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		Ractangle r01 = new Ractangle(3, 30, "빨강", "검정");

		r01.draw();

		Tringle t01 = new Tringle(5, 4, "초록", "파랑");

		t01.draw();
		
		Circle c01=new Circle(6,"남색", "노랑");
		
		c01.draw();
	}

}
