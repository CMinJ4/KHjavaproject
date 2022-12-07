package com.kh.day11.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		int num = 0;
		//Integer soo = new Integer(0); -> 예전방식 이제는 사용하지않음
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2 = 'F';
		
		if(Character.isDigit(c1)) {//숫자인지 아닌지 체크
			System.out.println(c1 + "은 숫자");
		}
		
		if(Character.isAlphabetic(c2)) {//문자인지 아닌지 체크하는거
			System.out.println(c2 + "는 영문자");
		}
				
	}
}
