package com.kh.day05.array;
import java.util.Scanner;

public class Exam_SortInsertion {
	public static void main(String [] args) {
		// ���� �˰���
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�?
		// ���� �˰��� �߿� �ϳ��̸鼭 ���� �����ϰ� �⺻�� �Ǵ�
		// �˰���
		// �迭�� n�� �ε������� 0������ n-1�� �ε������� ��!!!
		//{2, 5, 4, 1, 3}
		/*	
			i = 0
			2, 5, 4, 1, 3 // 1��° ���
			i = 1
			2, 4, 5, 1, 3
			2, 4, 5, 1, 3 // 2��° ���
			i = 2
			2, 4, 1, 5, 3
			2, 1, 4, 5, 3
			1, 2, 4, 5, 3 // 3 ��° ���
			.
			.
			.
		 */
		
		int [] nums = {9, 7, 10, 1, 4, 2, 6, 3, 5, 8, 0, 11, 41, 13, 23};
		int temp = 0, max = nums[0], min = nums[0];
		
		//�ʱ� �迭 ���
		System.out.println("* ó�� �Է¹��� �� *");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if(i < nums.length - 1) {
				System.out.print(", ");
			}
			if(max < nums[i]) { // �ִ밪 ���ϱ�
				max = nums[i];
			}
			if(min > nums[i]) { // �ּҰ� ���ϱ�
				min = nums[i];
			}
		}
		
		System.out.println();
		System.out.print("�ִ밪 : " + max + "  �ּҰ� : " + min);
		
		//������������ ����
		//�迭�� ù��° ���ں��� ������ ���ڱ��� �ݺ���
		for(int i = 0; i < nums.length; i++) {
			//�� ����� ���� ������ ���ڵ���� �ݺ���
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) { // ������������ ������
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		//�������� ���
		System.out.println("* �������� ���� �� ��� *");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if(i < nums.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		//������������ ����
		for(int i = 0; i < nums.length; i++) {
			//�� ����� ���� ������ ���ڵ���� �ݺ���
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] < nums[j]) { // ������������ ������
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		//�������� �迭 ���
		System.out.println("* �������� ���� �� ��� *");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			
			if(i < nums.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
