package com.kh.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("*�񱳿����� ����*");
		System.out.println();
		// 1 < 2,	3 < 2,	1 == 2,	1 != 1
		// true,	false,	false,	false
		// �񱳿����� : �� ���� ���ϴ� ������, ���迬����
		// �񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
		//[�ڷ���] [������] [���Կ�����] [������] [;]
		
		int num1 = 50;
		int num2 = 30;
		
		boolean result = num1 < num2;
		System.out.println("(num1 < num2)�� ��� : " + result);
		
		result = (num1 > num2);
		System.out.println("(num1 > num2)�� ��� : " + result);
		
		result = (num1 == num2); // �� ������ ���� ������ ���Ҷ��� "==" ���
		System.out.println("(num1 == num2)�� ��� : " + result);
		
		result = (num1 != num2);
		System.out.println("(num1 != num2)�� ��� : " + result);
		
		System.out.println();
		System.out.println();
		
		/*
		��� ����ұ�?
		¦Ȧ �Ǻ� ���α׷�
		¦���� �����ΰ�? 2�� ������ �� �������� 0�� ����
		*/
		
		int num = 2;
		result = (num % 2 == 0); // num���� �ȿ� ���ڸ� 2�� ������ ���� �������� 0�̸� true
		// ������[/]�� ����� ��, ��ⷯ��[%]�� ����� ������
		System.out.println("���� " + num +"��(��) ¦���ΰ���? : " + result);
	}
}
