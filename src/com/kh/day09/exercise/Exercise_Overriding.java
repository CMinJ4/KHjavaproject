package com.kh.day09.exercise;

class SuperClass{
	void paint() {
		draw();
	}
	
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass{
	void paint() { //����1. �������̵�. �θ�Ŭ������ �ִ°ſ� �̸��� ������ ������. �������ε��Ǿ� �����
		super.paint(); //����2. sub�� �ִ� draw
		super.draw();//����3. super�� �ִ� draw
	}
	
	void draw() {
		System.out.println("sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String [] args) {
		SuperClass ex = new SubClass(); // ��ĳ����
		ex.paint(); // �θ�Ÿ�� ���� ex
	}
}
