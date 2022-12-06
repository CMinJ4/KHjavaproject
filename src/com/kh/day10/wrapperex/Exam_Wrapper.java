package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		// Wrapper 객체로부터 기본 타입 값 알아내기
		// The constructor Integer(int) is deprecated since version 9
		// 아래처럼 사용하면 안됨. 버전 9 이후로 사라질 방식
		//Integer i = new Integer(1123);
		
		Integer i = Integer.valueOf(1123);// 객체
		int e = i.intValue(); //객체에서 기본형으로 변환해서 사용 가능.
		Integer f = null; // -> 객체이기 때문에 null 값을 넣을 수 있다.(기본형에서는 불가)
		// int m = null;
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		// 문자열을 기본 데이터 타입(int, boolean, double)으로 변환
		int num = Integer.parseInt("123");
		int result = num + 1; // 문자로 숫자를 받아서 계산할때 사용
		System.out.println("변환된 값 : " + num);
		boolean isyn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		// 기본 데이터 타입(int, double, char)을 문자열로 변환
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); // 16진수 7b로 변환
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);		
	}
}
