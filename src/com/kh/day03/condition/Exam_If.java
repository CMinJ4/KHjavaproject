package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		
		int input = sc.nextInt();
		String result = "";
		// ¦�� �Ǻ�
		if(input % 2 == 0) { // ¦������ �Ǻ�
			//System.out.println(input + "��/�� [¦��] �Դϴ�.");
			result = "¦��";
		}else {
			result = "Ȧ��";
		}
		
		System.out.println(input + "��/�� [" + result + "]�Դϴ�.");
		/*
		if(input % 2 != 0) { // Ȧ������ �Ǻ�
			System.out.println(input + "��/�� [Ȧ��] �Դϴ�.");
		}
		*/

	}
}