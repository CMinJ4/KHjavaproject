package com.kh.day07.oop;

public class Rectangle { // 클래스 선언, 접근지정자 public
	// ---필드---
	public int width;	// 너비(가로), 접근지정자 public
	public int height;	// 높이(세로), 접근지정자 public
	
	
	// ---메소드---
	// 생성자, 접근지정자는 public이고 반환형이 없음.
	// 생성자 -> 객체 생성, 객체 초기화(필드 초기화)
	// 생성자란? : 클래스와 이름이 같은 메소드입니다. 객체를 생성하고 객체를 초기화하는 역할을 수행합니다.
	
	public Rectangle() {} //생성자(생략이 가능하다)

	// 매개변수 있는 생성자(전달값을 받을 수 있는 생성자)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 반환형이 있는 메소드
	// getArea를 호출한 곳으로 값을 보낸다(리턴한다)
	public int getArea() {
		int area = width*height;
		return area;
	}
}
