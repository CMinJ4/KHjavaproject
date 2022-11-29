package com.kh.day04.loop;

public class Exam_For {
	public static void main(String [] args) {
		System.out.println("For문 예제 출력");
		int count = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print(i);
			count ++;
		}
		System.out.println();
		System.out.println("이 반복문은 [" + count + "]번 반복했습니다.");
	}
}
