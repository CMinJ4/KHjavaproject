package com.kh.day04.exercise;
//2�� ���� 3��, 3�� ���� 4��, 4�� ���� 5�� �ǵ���

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}// \t�� ���� ���
			System.out.println();
		}
	}
}