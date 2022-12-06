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
	void paint() { //실행1. 오버라이딩. 부모클래스에 있는거와 이름이 완전히 동일함. 동적바인딩되어 실행됨
		super.paint(); //실행2. sub에 있는 draw
		super.draw();//실행3. super에 있는 draw
	}
	
	void draw() {
		System.out.println("sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String [] args) {
		SuperClass ex = new SubClass(); // 업캐스팅
		ex.paint(); // 부모타입 변수 ex
	}
}
