package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	public static void main(String [] args) {
		// ������
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� ������� ������ ���� ���Ͻðڽ��ϱ�? : ");
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
		System.out.println(" �� ���� : " + result + " �Դϴ�.");
		//System.out.println("1 ~ " + input + "�� ���� " + result + "�Դϴ�.");
	}
}