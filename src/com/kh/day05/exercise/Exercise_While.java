package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	
	public void exercise1() {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		int i = 1; // while �� ������ ���� ����
		int result = 0; // ������� ������ ����

		while (i <= 100) { // 1 ~ 100���� ���ư�
			/*
			 * if(i%2 == 1) { // 2�� ������ �������� 1�̸� ����. �� Ȧ���̸� ���� result += i; // result ���� �ȿ�
			 * result + i�� ���� ������ } i++; // i �� 1 ������Ŵ
			 */
			result += i;
			i += 2; // 1���� 2�� �����ϸ� ��� Ȧ����
		}

		System.out.println("1 ~ 100 ������ Ȧ���� �J�� : " + result + "�Դϴ�."); // ������
	}

	
	
	public void exercise2() {
		/*
		 * - ���� - ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ���� �� ���� �������� ����ϼ���. ��, ������ ���� ������
		 * " 1 ~ 9������ ����� �Է��ϼž� �մϴ�"�� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in); // ������ �Է¹ޱ� ���� Scanner ���� ����
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt(); // input ������ �Է¹��� ���� ����
		int i = 1; // while�� ����� ���� ���� ����

		if (input >= 1 && input <= 9) { // �Է¹��� ������ 1 ~ 9 ���� �������� �Ǻ��� true�� ����
			while (i <= 9) { // i �� 9�϶����� �ݺ�
				System.out.println(input + " * " + i + " = " + input * i); // ���
				i++; // i ����
			}
		} else {
			System.out.println("1 ~ 9 ������ ����� �Է��ϼž� �մϴ�."); // �Է¹��� ������ 1 ~ 9 ������ ���ڰ� �ƴҽ� ���
		}
	}

	
	
	public void exercise3() {
		/*
		 * while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� -1�� �ԷµǸ� �Է��� ���� ���� ���Ͽ��� ���� �ϳ� �Է� : 3 ���� �ϳ�
		 * �Է� : 4 ���� �ϳ� �Է� : 7 ���� �ϳ� �Է� : -1 �Է��Ͻ� ���� ���� : 14
		 */

		// for���� �̿��Ͽ� �ذ��ϱ�
		Scanner sc = new Scanner(System.in); // ������ �Է¹ޱ� ���� sc ���� ����
		int result = 0; // ������� ������ result ���� ���� �ʱ�ȭ

		/*
		 * for (;;) { // ���ѷ����� ���ư� for�� System.out.print("���� �ϳ� �Է� : "); int input =
		 * sc.nextInt(); // input ������ ���� �Է¹޾� ����
		 * 
		 * if(input == -1) { // input ������ -1�̸� for���� �������� break; }
		 * 
		 * result += input; // result ������ �Է¹��� ������ ���ؼ� ������ }
		 * 
		 * System.out.println("�Է��Ͻ� ���� ���� : " + result);
		 */
		// while���� �̿��Ͽ� �ذ��ϱ�

		// result = 0;

		int input2 = 0;

		while (true) {
			System.out.print("���� �ϳ� �Է� : ");
			input2 = sc.nextInt();

			if (input2 == -1) {
				break;
			}

			result += input2;
		}

		System.out.println("�Է��Ͻ� ���� ���� : " + result);

		/*
		 * int input3 = 0; int sum2 = 0; do { System.out.print("���� �ϳ� �Է� : "); input3 =
		 * sc.nextInt();
		 * 
		 * if(input3 != -1) { sum2 += input3; } }while(input3 != -1);
		 * 
		 * System.out.println("�Է��Ͻ�s ���� ���� : " + sum2);
		 */
	}
}
