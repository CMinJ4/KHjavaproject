package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args) {
		
		/*
			- ���� - ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ���� �� ���� �������� ����ϼ���. ��, ������ ���� ������
			" 1 ~ 9������ ����� �Է��ϼž� �մϴ�"�� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in); // ������ �Է¹ޱ� ���� Scanner ���� ����
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt(); // input ������ �Է¹��� ���� ����
		int i = 1; // while�� ����� ���� ���� ����
		
		if(input >= 1 && input <= 9 ) { // �Է¹��� ������ 1 ~ 9 ���� �������� �Ǻ��� true�� ����
			while(i <= 9) { // i �� 9�϶����� �ݺ�
				System.out.println(input + " * " + i + " = " + input*i); // ���
				i++; // i ����
			}
		}else {
			System.out.println("1 ~ 9 ������ ����� �Է��ϼž� �մϴ�."); // �Է¹��� ������ 1 ~ 9 ������ ���ڰ� �ƴҽ� ���
		}
	}
}