package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	/*
		Suit suit = new Suit(100); �������
	*/
	
	public Suit(int size) { // 1. ȣ�����
		this(size, "Hazzys"); // 2. ȣ��
		//1��
		System.out.println("Suit(int) ȣ��!"); // 11. *����°�� ����*
	}
	public Suit(int size, String brand) { // 3. ȣ�����
		this(size, brand, 100000); // 4. ȣ��
		//2��
		System.out.println("Suit(int String) ȣ��!!"); // 10. *�ι�°�� ����*
	}
	public Suit(int size, String brand, int price) { // 5. ȣ�����
		this.size = size; // 6. �� �Է�
		this.brand = brand; // 7. �� �Է�
		this.price = price; // 8. �� �Է�
		//3��
		System.out.println("suit(int,String,int) ȣ��"); // 9. *ù��°�� ����*
	}
	
	//3 -> 2 -> 1
}
