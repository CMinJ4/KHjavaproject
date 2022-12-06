package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

//��ӽǽ�
//�ٸ� ��Ű�� �ȿ� �ִ� �θ� Ŭ���� ���� ���
class BlackPoint extends Point{
	void set() {
		pub = 1;
		pro = 3;
		//def = 2;
		//pri = 4; private���� ����Ǿ ����� �� ����.
	}
}

//���� ��Ű�� �ȿ� �ִ� �θ�Ŭ���� ���� ���
class Child extends Parent{
	public Child() {}
	void set() {
		pub = 1;
		def = 2;
		pro = 3;
		//pri = 4; private���� ����Ǿ ����� �� ����.
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
