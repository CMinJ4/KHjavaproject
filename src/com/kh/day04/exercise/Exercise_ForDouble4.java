package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble4 {
	public static void main(String [] args) {
		int num1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ����ұ��? : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) { // �� ����� �ټ��� ������
			
			for(int j = input-1; j > i; j--) { // �� �տ� �� ������ ���� ������. i�� ���ؼ� ������ ���� �����. ���� �ٲ�鼭 i�� �����ϰ� ������ ���� �پ��.
				System.out.print(" "); // �������
			}
			
			for(int k = 1; k <= num1; k++) { // ���� ���. ó���� 1�� �� �������� 2���� �þ
				System.out.print("*");
			}
			num1 += 2;
			System.out.println();
		}
		
		num1 = input*2-3;
		for(int i = 0; i < input; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" "); // �������
			}
			
			for(int k = 1; k <= num1; k++) { // ���� ���. ó���� 1�� �� �������� 2���� �þ
				System.out.print("*");
			}
			num1 -= 2;
			System.out.println();
		}
	}
}
