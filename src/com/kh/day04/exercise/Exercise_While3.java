package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
	public static void main(String[] args) {
		/*
		 * while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� -1�� �ԷµǸ� �Է��� ���� ���� ���Ͽ��� ���� �ϳ� �Է� : 3 ���� �ϳ�
		 * �Է� : 4 ���� �ϳ� �Է� : 7 ���� �ϳ� �Է� : -1 �Է��Ͻ� ���� ���� : 14
		 */
		
		//for���� �̿��Ͽ� �ذ��ϱ�
		Scanner sc = new Scanner(System.in); //������ �Է¹ޱ� ���� sc ���� ����
		int result = 0; // ������� ������ result ���� ���� �ʱ�ȭ
		
		/*
		for (;;) { // ���ѷ����� ���ư� for�� 
			System.out.print("���� �ϳ� �Է� : ");
			int input = sc.nextInt(); // input ������ ���� �Է¹޾� ����
			
			if(input == -1) { // input ������ -1�̸� for���� ��������
				break;
			}
			
			result += input; // result ������ �Է¹��� ������ ���ؼ� ������
		}
		
		System.out.println("�Է��Ͻ� ���� ���� : " + result);
		*/
		//while���� �̿��Ͽ� �ذ��ϱ�
		
		//result = 0;
		
		int input2 = 0;
		
		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			input2 = sc.nextInt();
			
			if(input2 == -1) {
				break;
			}
			
			result += input2;
		}
		
		System.out.println("�Է��Ͻ� ���� ���� : " + result);
		
		/*
		int input3 = 0;
		int sum2 = 0;
		do {
			System.out.print("���� �ϳ� �Է� : ");
			input3 = sc.nextInt();
			
			if(input3 != -1) {
				sum2 += input3;
			}
		}while(input3 != -1);
		
		System.out.println("�Է��Ͻ� ���� ���� : " + sum2);
		*/
	}
}
