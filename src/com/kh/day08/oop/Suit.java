package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	/*
		Suit suit = new Suit(100); 실행순서
	*/
	
	public Suit(int size) { // 1. 호출당함
		this(size, "Hazzys"); // 2. 호출
		//1번
		System.out.println("Suit(int) 호출!"); // 11. *세번째로 실행*
	}
	public Suit(int size, String brand) { // 3. 호출당함
		this(size, brand, 100000); // 4. 호출
		//2번
		System.out.println("Suit(int String) 호출!!"); // 10. *두번째로 실행*
	}
	public Suit(int size, String brand, int price) { // 5. 호출당함
		this.size = size; // 6. 값 입력
		this.brand = brand; // 7. 값 입력
		this.price = price; // 8. 값 입력
		//3번
		System.out.println("suit(int,String,int) 호출"); // 9. *첫번째로 실행*
	}
	
	//3 -> 2 -> 1
}
