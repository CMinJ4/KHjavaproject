package com.kh.day04.exercise;
//2´Ü ¿·¿¡ 3´Ü, 3´Ü ¿·¿¡ 4´Ü, 4´Ü ¿·¿¡ 5´Ü µÇµµ·Ï

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}// \t´Â ÅÇÀÇ ±â´É
			System.out.println();
		}
	}
}