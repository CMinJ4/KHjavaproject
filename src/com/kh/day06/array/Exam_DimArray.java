package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String [] args) {
		int [][] arrs = new int[4][4];
		int k = 1;
		arrs[0][0] = 1;
		
		System.out.println("세로(행)의 크기(앞의 크기) : " + arrs.length);
		System.out.println("가로(열)의 크기(뒤의 크기) : " + arrs[0].length);
		
		System.out.println();
		System.out.println();
		
		// 값을 넣어주기 초기화
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		/*
			[0,0] [0,1] [0,2] [0,3]
			[1,0] [1,1] [1,2] [1,3]
			[2,0] [2,1] [2,2] [2,3]
			[3,0] [3,1] [3,2] [3,3]

		 */
		
		// 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]); // %2d에 들어간 숫자 2는 자릿수를 말함 3으로 적으면 3자리수로 고정	
			}
			System.out.println(); // 개행해주기
		}
	}
}
