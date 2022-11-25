package com.kh.day03.typetrans;

public class TestTypeTrans2 {
	public static void main(String [] args) {
		byte b = 127;	// 1byte
		int i = 100;	// 4byte
		
		//자동 형변환 -> 작은 자료형이 큰 자료형으로 자동으로 변환됨
		System.out.println(b+i); // 변수b 가 int로 자동 형 변환 되어서 계산됨
		System.out.println(10/4); // 당연히 2 결과가 나옴
		System.out.println(10.0/4); // 4 -> 4.0으로 자동 형 변환되어 계산됨
		
		System.out.println();
		System.out.println();
		
		//강제 형변환 -> 큰 자료형을 작은 자료형으로 변환, 데이터 손실 발생!!
		System.out.println((char)0x12340041);
		System.out.println((byte)(b + i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
