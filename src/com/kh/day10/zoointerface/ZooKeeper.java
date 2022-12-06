package com.kh.day10.zoointerface;

public class ZooKeeper {
	public void feed() {
		System.out.println("feed meat");
	}
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood());
	}
	
	/*
	//메소드를 오버로딩해서 해결하는법
	//인터페이스로 만들어서 간소화할 수 있다.
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
