package com.kh.day10.abstractex;

// The type Line must implement
// The type Line must implement the inherited abstract method Shape.draw()
// 상속된 추상메소드는 반드시 구현(오버라이딩)되어야한다.
abstract class Line extends Shape{

	/*
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}*/
	
}

public abstract class Shape {
	public Shape() {}
	
	public void paint() {}
	
	abstract public void draw();
	//The abstract method draw in type Shape can only be defined by an abstract class
	//Abstract methods do not specify a body
	//중괄호를 쓰지 말라.

	
	public static void main(String [] args) {
		
	}
}
