package com.kh.day04.exercise;

public class Exercise_For2 {
	public static void main(String [] args) {
		//1부터 10까지의 덧셈을 표시하고 합도 구하시오
		
		int result = 0; //결과값을 저장할 변수
		
		for(int i = 1; i <= 10; i++) {
			result += i;//result 변수 안에 1 부터 10까지 더한 값을 저장해준다.
			System.out.print(i);//숫자를 출력해주는 부분 

			if(i <= 9) { // 숫자 1 ~ 10 사이에 +라는 문자를 넣어주기 위해 정해준 범위
				System.out.print(" + ");//+를 출력해주는 부분 마지막 10 뒤에는 출력하지 않는다.
			}else {
				System.out.print(" = ");
			}
		}
		System.out.println(result);//결과값을 출력하는 부분
	}
}
