package com.javaex.ex16;

public class GoodsApp {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];

		Goods camera = new Goods("니콘", 300000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 6000);

		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;

		int count = 0;

		for (int i = 0; i < goodsArray.length; i++) {
			goodsArray[i].showInfo();
			count++;
		}
		Goods goods = new Goods();
		goods.countInfo(count);

	}

}
