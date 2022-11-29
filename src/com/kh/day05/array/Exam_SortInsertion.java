package com.kh.day05.array;
import java.util.Scanner;

public class Exam_SortInsertion {
	public static void main(String [] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 삽입정렬이란?
		// 정렬 알고리즘 중에 하나이면서 가장 간단하고 기본이 되는
		// 알고리즘
		// 배열의 n번 인덱스값을 0번에서 n-1번 인덱스까지 비교!!!
		//{2, 5, 4, 1, 3}
		/*	
			i = 0
			2, 5, 4, 1, 3 // 1번째 결과
			i = 1
			2, 4, 5, 1, 3
			2, 4, 5, 1, 3 // 2번째 결과
			i = 2
			2, 4, 1, 5, 3
			2, 1, 4, 5, 3
			1, 2, 4, 5, 3 // 3 번째 결과
			.
			.
			.
		 */
		
		int [] nums = {9, 7, 10, 1, 4, 2, 6, 3, 5, 8, 0, 11, 41, 13, 23};
		int temp = 0, max = nums[0], min = nums[0];
		
		//초기 배열 출력
		System.out.println("* 처음 입력받은 값 *");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if(i < nums.length - 1) {
				System.out.print(", ");
			}
			if(max < nums[i]) { // 최대값 구하기
				max = nums[i];
			}
			if(min > nums[i]) { // 최소값 구하기
				min = nums[i];
			}
		}
		
		System.out.println();
		System.out.print("최대값 : " + max + "  최소값 : " + min);
		
		//오름차순으로 정렬
		//배열의 첫번째 숫자부터 마지막 숫자까지 반복함
		for(int i = 0; i < nums.length; i++) {
			//비교 대상인 숫자 다음에 숫자들까지 반복함
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) { // 오름차순으로 정격함
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		//오름차순 출력
		System.out.println("* 오름차순 정렬 후 결과 *");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if(i < nums.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		//내림차순으로 정렬
		for(int i = 0; i < nums.length; i++) {
			//비교 대상인 숫자 다음에 숫자들까지 반복함
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] < nums[j]) { // 내림차순으로 정격함
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		//내림차순 배열 출력
		System.out.println("* 내림차순 정렬 후 결과 *");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			
			if(i < nums.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
