package com.kh.day05.array;

//변수 두개의 값 바꾸기.

public class Exam_ArraySort {
	public static void main(String [] args) {
		int num1 = 11;
		int num2 = 23;
		int temp = 0;
		System.out.print("num1 : " + num1 + ", num2 : " + num2);
		
		System.out.println();
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.print("num1 : " + num1 + ", num2 : " + num2);
		
		System.out.println();
		
		int [] nums = {2, 1, 3};
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}