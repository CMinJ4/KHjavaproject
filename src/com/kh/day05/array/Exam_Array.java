package com.kh.day05.array;

import java.util.Random;

public class Exam_Array {
	public static void main(String [] args) {
		
		// �迭�� 1 ~ 10 ������ ������ �� �־ ����ϱ�
		Random rand = new Random();
		int [] randNums = new int[10];
		
		for(int i = 0; i < 10; i++) {
			randNums[i] = rand.nextInt(30)+1;
		}
		
		for(int i = 0; i < randNums.length; i++) {
			System.out.println(randNums[i]);
		}
		//---------------------------------------------------
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int num;
		//�迭��[����, �Ҵ�, �ʱ�ȭ]�� �̷������
		int [] nums = new int[10];
		System.out.println(nums[0]); 
		
		nums[0] = 10; 
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println("ù��° �� : " + nums[0]);
		System.out.println("�ι�° �� : " + nums[1]);
		System.out.println("����° �� : " + nums[2]);
		System.out.println("�迭�� ũ�� : " + nums.length);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		for(int i = 0; i < nums.length; i++) {
		//nums �迭�� ��� 100���� �ʱ�ȭ����
			nums[i] = 100;
		}
		
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
