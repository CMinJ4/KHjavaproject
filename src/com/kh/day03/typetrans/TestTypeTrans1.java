//자동 형변환 실습
//작은타입이 큰타입을 만나면 큰타입으로 자동변환되어 계산이 이루어진다.
package com.kh.day03.typetrans;

public class TestTypeTrans1 {
	public static void main(String [] args) {
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;
		
		System.out.println("result : " + result);
		System.out.println("강제 형 변환 : " + (int)result); //작은타입으로 강제 형 변환이 가능하다.
		System.out.println("강제 형 변환 : " + (char)65);
	}
}
