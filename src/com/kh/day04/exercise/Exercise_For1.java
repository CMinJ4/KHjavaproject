package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	public static void main(String [] args) {
		// 누적합
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 몇까지의 숫자의 합을 구하시겠습니까? : ");
		int input = sc.nextInt();
		int count = 1;
		System.out.println();
		
		for(int i = 1; i <= input; i++) {
			result += i;
			System.out.print(i);
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
			
			if(i < input) {
				System.out.print(" + ");
			}
			count ++;

			
		}
		System.out.println();
		System.out.println(" 의 값은 : " + result + " 입니다.");
		//System.out.println("1 ~ " + input + "의 합은 " + result + "입니다.");
	}
}