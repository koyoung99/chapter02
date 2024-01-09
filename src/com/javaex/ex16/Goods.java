package com.javaex.ex16;

public class Goods {

	private String name;
	private int price;
	private int count;

	public Goods() {

	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	public void showInfo() {
		System.out.println("상품명: " + this.name + ", 상품가격: " + this.price + "원");
	}

	public void countInfo(int count) {
		System.out.println("상품수량:" + count);
	}
}
