package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_DimArray {
	public void exercise1() {
		//  5   4   3   2   1
		// 10   9   8   7   6
		// 15  14  13  12  11
		// 20  19  18  17  16
		// 25  24  23  22  21

		int [][] array = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length-1; j >= 0; j--) {
				array[i][j] = k;
				k ++;
			}
		}
		//출력
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise2() {
		// 5   10   15   20   25
		// 4    9   14   19   24
		// 3    8   13   18   23
		// 2    7   12   17   22
		// 1    6   11   16   21

		int [][] array = new int[5][5];
		int k = 1;

		for(int i = 0; i < array.length; i++) {
			for(int j = array.length-1; j >= 0; j--) {
				array[j][i] = k;
				k++;
			}
		}
		//출력
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise3() {
		//  1   6   11   16   21
		//  2   7   12   17   22
		//  3   8   13   18   23
		//  4   9   14   19   24
		//  5  10   15   20   25
		
		int [][] arrs = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs.length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		//출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}
	
	public void exercise4() {
		//  1    2    3    4    5
		// 10    9    8    7    6
		// 11   12   13   14   15
		// 20   19   18   17   16
		// 21   22   23   24   25
		int [][] arrs = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {

			if(i % 2 == 1) {
				for(int j = arrs.length - 1; j >= 0; j--) { // 뒤에서부터 숫자를 넣어줌
					arrs[i][j] = k;
					k++;
				}
			}else if(i % 2 == 0) {
				for(int j = 0; j < arrs.length; j++) { // 앞에서부터 숫자를 넣어줌
					arrs[i][j] = k;
					k++;
				}
			}
			
		}
		//출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}
	
	public void exercise5() {
		//2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		//4년간 전체 평점 평균을 출력하라
		
		double [][] score = {{3.3, 3.4},{3.5, 3.6},{3.7, 4.0},{4.1, 4.2}};// {{[0][0], [0][1]}, {[1][0], [1][1]} ... {[3][1]}}
		double sum = 0, aver = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		
		/*
		System.out.println((3.3+3.4+3.5+3.6+3.7+4.0+4.1+4.2)/8);
		System.out.println(sum);
		System.out.println(sum/8);
		*/
		
		aver = sum/(score.length * score[0].length);
		
		System.out.println("4년 전체 평점 평균은 : " + aver);
	}
	
	public void exercise5_1() {
		//2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		//4년간 전체 평점 평균을 출력하라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 학년 수를 입력하세요 : ");
		int le1 = sc.nextInt();
		
		System.out.print("총 학기 수를 입력하세요 : ");
		int le2 = sc.nextInt();
		
		double [][] score = new double[le1][le2];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d학년 %d학기 성적을 입력하세요.",i+1,j+1 );
				score[i][j] = sc.nextDouble();
			}
		}
		
		double sum = 0, aver = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		
		/*
		System.out.println((3.3+3.4+3.5+3.6+3.7+4.0+4.1+4.2)/8);
		System.out.println(sum);
		System.out.println(sum/8);
		*/
		
		aver = sum/(score.length * score[0].length);
		
		System.out.println(le1 + "년간 전체 평점의 평균은 : " + aver);
	}
}
