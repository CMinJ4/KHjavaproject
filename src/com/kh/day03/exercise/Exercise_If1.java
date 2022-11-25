//정수하나를 입력받아서 양의 정수인지, 0인지, 음의 정수인지
//판별하는 프로그램을 작성하시오.
// indent 정리 : ctrl + shift + f

package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		String result = "";

		if (input == 0) {
			result = "0";
		} else if (input > 0) {
			result = "양의 정수";
		} else if (input < 0) {
			result = "음의 정수";
		}

		System.out.println("input은/는 [" + result + "]입니다.");
	}
}