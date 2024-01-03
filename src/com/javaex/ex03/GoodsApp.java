package com.javaex.ex03;

public class GoodsApp {

	public static void main(String args[]) {

		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();

		// private 캡슐화(필드값 보호)
		camera.setName("니콘");
		camera.setPrice(400000);

		computer.setName("LG그램");
		computer.setPrice(900000);

		cup.setName("머그컵");
		cup.setPrice(2000);

		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}
