//���� ���α׷� �����
package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculater {
	public static void main(String[] args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���!!
		// ������ �Է����ּ��� : 11
		// ������ �ѹ� �� �Է����ּ��� : 22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
		// ��� : 11 % 22 = 11

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		double input1 = sc.nextDouble(); // ���� ���� �� ������ �Է¹���

		System.out.print("������ �ѹ� �� �Է����ּ��� : ");
		double input2 = sc.nextDouble(); // ���� ���� �� ������ �Է¹���

		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0); // ���� ���� �� �����ڸ� ���ڷ� �Է¹���

		double result = 0; //������� �������� ��������

		System.out.println();
		
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') { // �����ڸ� �ùٸ��� �Է¹޾Ҵ��� Ȯ����.
			if (operator == '+') { // ���ϱ� ������
				result = input1 + input2;
			} else if (operator == '-') { // ���� ����
				result = input1 - input2;
			} else if (operator == '*') { // ���ϱ� ����
				result = input1 * input2;
			} else if (operator == '/') { // ������ ����
				result = input1 / input2;
			} else if (operator == '%') { // ���������ϴ� ����
				result = input1 % input2;
			}

			System.out.println("��� : " + input1 + " " + operator + " " + input2 + " = " + result); // ����� �����
		} else { // �����ڸ� �߸� �Է������� ���
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
	}
}