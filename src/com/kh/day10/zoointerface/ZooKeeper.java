package com.kh.day10.zoointerface;

public class ZooKeeper {
	public void feed() {
		System.out.println("feed meat");
	}
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood());
	}
	
	/*
	//�޼ҵ带 �����ε��ؼ� �ذ��ϴ¹�
	//�������̽��� ���� ����ȭ�� �� �ִ�.
	public void feed(Tiger tiger) {
		System.out.println("feed beef");
	}
	public void feed(Lion lion) {
		System.out.println("feed gazel");
	}
	public void feed(Bear bear) {
		System.out.println("feed salmon");
	}
	*/
}
