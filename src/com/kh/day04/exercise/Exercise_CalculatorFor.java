//����ġ���� �̿��� ���� ���α׷�

package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalculatorFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int count = 0;
		
		for (; true;) {
			System.out.print("���� �ϳ� �Է� : ");
			int num1 = sc.nextInt();
			
			System.out.print("���� �ϳ� �� �Է� : ");
			int num2 = sc.nextInt();
			
			System.out.print("������ �Է� (+,-,*,/,%) : ");
			char operator = sc.next().charAt(0);
			
			int result = 0;
			
			// ������ �Ǻ� �� ���� ���� �׸��� ����� ����
			
			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			}
			
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result + " �Դϴ�.");
			System.out.println();
			
			System.out.print("�����ðڽ��ϱ�? (y/n) : ");
			char word = sc.next().charAt(0);
			
			if(word == 'y') {
				break;
			}else if(word == 'Y') {
				break;
			}
		}
	}
}
