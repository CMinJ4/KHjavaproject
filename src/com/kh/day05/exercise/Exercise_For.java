package com.kh.day05.exercise;

import java.util.Scanner;
//exercise �޼ҵ�� ��� �ϳ��� �����.

public class Exercise_For {
	
	public void exercise1() {
		// For1������
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
	}
			
	public void exercise2() {
		//For2
		//1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�	
		int result = 0; //������� ������ ����
		
		for(int i = 1; i <= 10; i++) {
			result += i;//result ���� �ȿ� 1 ���� 10���� ���� ���� �������ش�.
			System.out.print(i);//���ڸ� ������ִ� �κ� 
			
			if(i <= 9) { // ���� 1 ~ 10 ���̿� +��� ���ڸ� �־��ֱ� ���� ������ ����
				System.out.print(" + ");//+�� ������ִ� �κ� ������ 10 �ڿ��� ������� �ʴ´�.
			}else {
				System.out.print(" = ");
			}
		}
		System.out.println(result);//������� ����ϴ� �κ�
	}
			
	public void exercise3() {
		//For3
		int result = 0;
		
		for(int i = 1; i <= 9; i++){
			result = 2 * i;
			
			System.out.println("2 * " + i + " = " + result);
		}
	}
	
	public void exercise4() {
		/*
		 * - ���� - ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ���� �� ���� �������� ����ϼ���. ��, ������ ���� ������
		 * " 1 ~ 9������ ����� �Է��ϼž� �մϴ�"�� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in); // ������ �Է¹ޱ� ���� Scanner ���� ����

		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt(); // ������ �Է¹޾� input������ �־���

		// AND && OR ||
		if (input >= 1 && input <= 9) { // �Է¹��� ������ 1 ~ 9 ������ �������� Ȯ��
			for (int i = 1; i <= 9; i++) { // �Է¹��� ������ ������ ��� ���
				System.out.println(input + " * " + i + " = " + input * i);
			}
		} else { // �Է¹��� ������ 1 ~ 9 ������ ���ڰ� �ƴҶ� ���
			System.out.println("1 ~ 9������ ����� �Է��ϼž� �մϴ�.");
		}
	}
}
