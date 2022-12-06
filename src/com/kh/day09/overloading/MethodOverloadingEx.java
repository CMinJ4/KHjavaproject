package com.kh.day09.overloading;


//�������̵��� ��ӹ��� �ڽ�Ŭ������ �����Ѵ�.
//�����ε��� �ڱ� �ڽſ��� �����Ѵ�.
//	�̸��� �����ϸ� ������ �߻��ϱ� ������ �Ű����� or Ÿ�� ������ �������־�� �Ѵ�.
class Weapon{
	
	
	//�Ʒ� ������ ���� �����ε��� �Ǵ°ſ���.
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	
	protected int fire() {
		return 1;
	}
	
	
	protected int fire(int steampack) { // �����ε�(�Ű����� 1�� �߰�)
		return steampack*100;
	}
	
	protected int fire(int steampack, int medicine) { // �����ε�(�Ű����� 2�� �߰�)
		return steampack*medicine;
	}
	
	protected int fire(String steampack) { // �����ε�(�Ű����� Ÿ���� �ٸ��� ����)
		System.out.println("steampack");
		return 1;
	}
}

class Cannon extends Weapon{
	
	protected int fire() { // �������̵�
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String [] args) {
		Weapon wp = new Cannon();
		
		System.out.println();
		System.out.println("Hellow World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}
}
