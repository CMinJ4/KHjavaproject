package com.kh.day02.variable;
import java.util.Scanner; // Scanner를 사용하기 위한 호출
//변수 

public class TestDataType {
	public static void main(String [] args) {
		/*	자료형 변수명 대입연산자 데이터 ;
		 	1. 자료형의 종류
			정수,	문자열 
			int,	String
			시험에 나올 수 있기 때문에 암기가 필요하다. 크기가 얼마인지?
		*/ 
		
		// 정수 part
		byte bNum = 127; // byte는 -128 ~ 127 까지 넣을 수 있음
		short sNum = 32767; //short는  - 32768 ~ 32767 까지 넣을 수 있음
		int iNum = 2147483647; // int는 -2147483648 ~ 2147483647 까지 넣을 수 있음
		long lNum = 2147483648l; // 접미사 l을 붙여야함.
		short num = 128; // 127을 넘어가기 때문에 byte를 사용할 수 없다.
		
		// 실수 part
		float fNum = 22.1123f; // 접미사 f를 붙여야함.
		double dNum = 23.502; // 평균 구할때 많이 사용할것
		
		//문자 part
		char fChar = 'A'; //' '홑따옴표 안에는 1개의 문자
		String sChar = "Hello Java"; // 쌍따옴표 안에는 여러개의 문자
		
		//Boolean형
		boolean result = false; // 참이냐 거짓이냐를 나타냄 제어문에서 사용.
		// 1>0, 2<1 ... 
		
		//입력받은 값 출력해보기
		System.out.println("정수의 값 : "+iNum);
		System.out.println("정수의 값(9999억) : "+lNum);
		System.out.println("실수의 값 : "+fNum);
		System.out.println("실수의 값 : "+dNum);
		System.out.println("문자의 값 : "+fChar);
		System.out.println("문자열의 값 : "+sChar);
		System.out.println("논리의 값 : "+result);
		
		System.out.println();
		System.out.println();
		
		//ASCII(아스키) 코드
		//문자(char)는 숫자를 저장할 수 있고 ASCII코드에 매핑되어있는 문자로 출력이 가능하다.
		fChar = 66;
		System.out.println(fChar);//B출력
		
		fChar = 75;
		System.out.println(fChar);//K출력
		
		
		System.out.println();
		System.out.println();
		
		//사용자로부터 숫자를 입력받아 2진수 8진수 16진수로 바꿔주기
		int num1;
		Scanner sc = new Scanner(System.in);//객체생성
		System.out.print("숫자를 입력하세요. : ");
		num1 = sc.nextInt();
	
		String binaryString = Integer.toBinaryString(num1);
		String octalString = Integer.toOctalString(num1);
		String hexString = Integer.toHexString(num1);
		
		System.out.println(num1 + "의 2진수 값 : " + binaryString);
		System.out.println(num1 + "의 8진수 값 : " + octalString);
		System.out.println(num1 + "의 16진수 값 : " + hexString);
		
		
	}
}
