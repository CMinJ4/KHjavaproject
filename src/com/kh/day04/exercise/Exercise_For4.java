package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
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
