package com.kh.day10.abstractex;

// The type Line must implement
// The type Line must implement the inherited abstract method Shape.draw()
// ��ӵ� �߻�޼ҵ�� �ݵ�� ����(�������̵�)�Ǿ���Ѵ�.
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
	//�߰�ȣ�� ���� ����.

	
	public static void main(String [] args) {
		
	}
}
