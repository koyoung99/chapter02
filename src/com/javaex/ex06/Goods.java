package com.javaex.ex06;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자 (메모리에 올리는 일(클래스 → 인스턴스화))
	public Goods() {
		System.out.println("Goods()");
	}

	public Goods(String name) {
		this.name = name;
		System.out.println("Goods(name)");

	}

//	public Goods(String name, int price) {
//		this.name = name;
//		this.price = price;
//		System.out.println("Goods(name,price)");
//
//	}
//	
	public Goods(String name, int price) {
		this(name);
		this.price = price;
	}

	// 메소드(g/s)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드(일반)
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
