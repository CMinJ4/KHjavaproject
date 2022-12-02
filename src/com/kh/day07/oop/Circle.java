package com.kh.day07.oop;

public class Circle { // 클래스 선언(class Circle), 클래스 접근 권한 public
	// ---필드---
	//접근지정자 : public
	public int radius; // 원의 반지름 필드(전역변수, 클래스변수, 멤버변수, 필드변수)
	public String name; // 원의 이름 필드
	
	// ---메소드---
	// 클래스명과 이름이 같은 메소드
	// -> 생성자 : 필드를 초기화해주는 역할을 한다. 생략가능
	//접근지정자 : public
	public Circle() { // 원의 생성자 메소드
		//클래스와 이름이같은 메소드다
		//객체를 생성 해준다
		//필드의 값을 초기화 해준다(초기화는 생성자에)
		this.radius = 1;
		this.name = "원";
	}
	
	//접근지정자 : public
	//반환형이 있는 메소드(반환값이 있음, return)
	public double getArea() {
		return 3.14*radius*radius;
		// 변수를 쓰냐 안쓰냐의 차이가 있음.
		// double area = 3.14*radius*radius;
		// return area;
	}
}
