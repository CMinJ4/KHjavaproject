package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String [] args) {
		// �Է��� ���� -1�� �ɶ����� ~~ �Ͻÿ�.
		System.out.println("�Է¹��� ��� ������ �� ���ϱ�.");
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		do {
			sum += input;
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
		}while(input != -1);
		
		System.out.println("��� : " + sum);
	}
}