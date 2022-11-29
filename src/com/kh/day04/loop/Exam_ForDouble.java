package com.kh.day04.loop;

public class Exam_ForDouble {
	public static void main(String [] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "´Ü Ãâ·Â");
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}