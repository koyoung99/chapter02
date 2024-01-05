package com.javaex.ex13;

public class GoodsApp {

	public static void main(String[] args) {

		// 배열만들기
		Goods[] goodsArray = new Goods[3];

		// 상품만들기
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 5000);

		// 배열안에 상품대입
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;

//		System.out.println(camera.getName());
//		System.out.println(goodsArray[1]);

//		camera.showInfo();
//		computer.showInfo();
//		cup.showInfo();

		int count = 0;

		for (int i = 0; i < goodsArray.length; i++) {
			if (goodsArray[i] != null) {
				goodsArray[i].showInfo();
				count++;

			}
		}
		System.out.println("\n전체상품갯수:" + count);

//		System.out.println(camera.toString());
//		System.out.println(computer.toString());
//		System.out.println(cup.toString());

	}

}
