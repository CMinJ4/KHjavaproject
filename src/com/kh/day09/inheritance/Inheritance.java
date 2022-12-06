package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

//상속실습
//다른 패키지 안에 있는 부모 클래스 변수 사용
class BlackPoint extends Point{
	void set() {
		pub = 1;
		pro = 3;
		//def = 2;
		//pri = 4; private으로 선언되어서 사용할 수 없다.
	}
}

//같은 패키지 안에 있는 부모클래스 변수 사용
class Child extends Parent{
	public Child() {}
	void set() {
		pub = 1;
		def = 2;
		pro = 3;
		//pri = 4; private으로 선언되어서 사용할 수 없다.
	}
}

class Parent{
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money += money;
	}
}



public class Inheritance {
	public static void main(String [] args) {
		Child child = new Child();
		child.setMoney(6000);

		System.out.println("Parent money : " + child.getMoney());
	}
}
