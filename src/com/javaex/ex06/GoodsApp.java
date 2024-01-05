package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();

		camera.setName("니콘");
		camera.setPrice(300000);
		System.out.println(camera.toString());

		Goods computer = new Goods("니콘");
		computer.setPrice(9000000);
		System.out.println(computer.toString());

		Goods cup = new Goods("머그컵", 20000);
		System.out.println(cup.toString());

	}

}
