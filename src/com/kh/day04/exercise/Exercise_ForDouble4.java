package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble4 {
	public static void main(String [] args) {
		int num1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("몇줄을 출력할까요? : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) { // 총 출력할 줄수를 결정함
			
			for(int j = input-1; j > i; j--) { // 별 앞에 들어갈 공백의 수를 결정함. i와 비교해서 공백의 수를 출력함. 줄이 바뀌면서 i가 증가하고 공백의 수가 줄어듬.
				System.out.print(" "); // 공백출력
			}
			
			for(int k = 1; k <= num1; k++) { // 별을 출력. 처음엔 1개 그 다음부터 2개씩 늘어남
				System.out.print("*");
			}
			num1 += 2;
			System.out.println();
		}
		
		num1 = input*2-3;
		for(int i = 0; i < input; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" "); // 공백출력
			}
			
			for(int k = 1; k <= num1; k++) { // 별을 출력. 처음엔 1개 그 다음부터 2개씩 늘어남
				System.out.print("*");
			}
			num1 -= 2;
			System.out.println();
		}
	}
}
