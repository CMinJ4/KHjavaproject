package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("*논리연산자 예제1*");
		System.out.println();
		// 남자[이면서] 평균 평점 4.3이상인 사람 -> AND -> &&
		// 컴퓨터공학과 [또는] 경영학과인 사람 -> OR -> ||
		
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; // 변수의 선언
		
		//num1과 num2가 다르면서 num2가 num1보다 클때
		result1 = (num1 != num2) && (num1 < num2); // 둘중 하나만 false가 나오면 false가 출력
		System.out.println("(num1 != num2) && (num1 < num2)의 값은 : " + result1);
		
		result2 = (num1 < num2) || (num1 == num2); // 예상값 false
		System.out.println("(num1 < num2) || (num1 == num2)의 값은 : " + result2);
		
		result3 = (num1 > num2) && (num1 != num2); // 예상값 true
		System.out.println("(num1 > num2) && (num1 != num2)의 값은 : " + result3);
		
		result4 = (num1 > num2) || (num1 == num2); // 예상값 true
		System.out.println("(num1 > num2) || (num1 == num2)의 값은 : " + result4);
		
		System.out.println();
		System.out.println();
		
		//예제2--------------------------------------------------------------------
		System.out.println("*논리연산자 예제2*");
		System.out.println();
		
		int aNum = 70;
		int bNum = 55;
		
		result1 = (aNum == bNum) || (aNum++ < 100); // 예상 true
		System.out.println("result1의 값은 : " + result1);
		System.out.println("aNum = " + aNum + ", bNum = " + bNum);
		System.out.println();
		
		result2 = (aNum < bNum) && (--bNum < 55); // 예상 false
		// 뒤에 --bNum은 연산 자체가 안됨. 첫번째 조건에서 false가 나오기 때문에 뒤에 연산은 처리하지 않음.
		System.out.println("result2의 값은 : " + result2);
		System.out.println("aNum = " + aNum + ", bNum = " + bNum);
		System.out.println();
		
		result3 = (aNum != bNum) && (bNum-- < aNum++); // 예상 true
		System.out.println("result3의 값은 : " + result3);
		System.out.println("aNum = " + aNum + ", bNum = " + bNum);
		System.out.println();
		
		result4 = (aNum++ != bNum) || (bNum++ >= 85); // 예상 true
		// 뒤에 bNum++ 는 연산 자체가 안됨. 첫번째 조건에서 true가 나오기 때문에 뒤에 연산은 처리하지 않음.
		System.out.println("result4의 값은 : " + result4);
		System.out.println("aNum = " + aNum + ", bNum = " + bNum);
		System.out.println();
		
		/*
			AND = 둘다 참이어야 참이 나옴 앞쪽 조건이 거짓이면 뒤에 조건을 처리하지 않음
			OR = 둘중 하나만 참이면 참이 나옴 앞쪽 조건이 참이면 뒤에 조건을 처리하지 않음
 
		 */

	}
}