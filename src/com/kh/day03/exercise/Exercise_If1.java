//�����ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� ��������
//�Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
// indent ���� : ctrl + shift + f

package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		String result = "";

		if (input == 0) {
			result = "0";
		} else if (input > 0) {
			result = "���� ����";
		} else if (input < 0) {
			result = "���� ����";
		}

		System.out.println("input��/�� [" + result + "]�Դϴ�.");
	}
}