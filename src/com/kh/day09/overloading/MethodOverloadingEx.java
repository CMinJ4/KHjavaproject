package com.kh.day09.overloading;


//오버라이딩은 상속받은 자식클래스에 복붙한다.
//오버로딩은 자기 자신에게 복붙한다.
//	이름이 동일하면 오류가 발생하기 때문에 매개변수 or 타입 갯수를 변경해주어야 한다.
class Weapon{
	
	
	//아래 생성자 역시 오버로딩이 되는거였다.
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
	
	
	protected int fire(int steampack) { // 오버로딩(매개변수 1개 추가)
		return steampack*100;
	}
	
	protected int fire(int steampack, int medicine) { // 오버로딩(매개변수 2개 추가)
		return steampack*medicine;
	}
	
	protected int fire(String steampack) { // 오버로딩(매개변수 타입을 다르게 해줌)
		System.out.println("steampack");
		return 1;
	}
}

class Cannon extends Weapon{
	
	protected int fire() { // 오버라이딩
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
