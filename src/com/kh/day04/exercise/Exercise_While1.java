package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 1; // while 문 동작을 위한 변수
		int result = 0; // 결과값을 저장할 변수
		
		while (i <= 100) { // 1 ~ 100까지 돌아감
			/*
			if(i%2 == 1) { // 2로 나눠서 나머지가 1이면 실행. 즉 홀수이면 실행
				result += i; // result 변수 안에 result + i의 값을 저장함
			}
			i++; // i 를 1 증가시킴
			*/
			result += i;
			i += 2; // 1에서 2씩 증가하면 계속 홀수임
		}
		
		System.out.println("1 ~ 100 까지의 홀수의 핲은 : " + result + "입니다."); // 결과출력
	}
}

/*
	복합대입연산자
	i = i + 1; -> i += 1;
	i = i * 4; -> i *= 4;
*/