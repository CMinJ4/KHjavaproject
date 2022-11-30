package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		//���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		//������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		int [] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.print(nums[i] + " ");
		}
		
	}
	
	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		//"����", "������", "Ű��", "���", "�ٳ���"��
		//�ʱ�ȭ �� ��, for���� Ȱ���Ͽ� �ٳ����� ������ �ٳ����� ����غ�����!.
		
		String [] fruits = new String[5];//�迭 ���� ����

		// �ڵ���̵� �ʱ�ȭ
		fruits[0] = "����";
		fruits[1] = "������";
		fruits[2] = "Ű��";
		fruits[3] = "���";
		fruits[4] = "�ٳ���";
		
		// ���� �� ���ϰ� �Ҵ�� �ʱ�ȭ�� ���ÿ�!
		//�߰�ȣ �ȿ� �ٷ� �ʱ�ȭ���� �־��ָ� ��.
		String [] fruitGoods = {"����", "������", "Ű��", "���","�ٳ���"};
		
		//for���� �̿��ؼ� ����ϱ�
		for(int i = 0; i < fruitGoods.length; i++) {
			System.out.print(fruitGoods[i]);
			if(fruitGoods[i] == "Ű��") {
				System.out.print(" <=== �߰�!");
			}
			System.out.println();
		}
	}
	
	public void exercise3() {
		/*
		���� ���� 5���� �Է¹޾� �迭�� �����ϰ�.
		�Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		int [] input = new int[5];
		int sum = 0;
		
		System.out.println("���� ���� 5���� �Է¹޾� ��� ���ϱ�.");
		System.out.println();
		
		for(int i = 0; i < input.length; i++){
			System.out.print("���� ������ �Է��ϼ��� : ");
			input[i] = sc.nextInt();
			
			if(input[i] > 0) { //���� �������� Ȯ���ϴ� �κ�
				sum += input[i]; //�Է¹��� ���� ���� sum ������ ����
			}else if(input[i] < 0) { // ���� ������ �ƴϸ� ����Ǵ� �κ�
				System.out.println("�ٽ� �Է��ϼ���.");
				i--; // i�� 1 �ٿ��־�� �ٽ� �Է¹��� �� �ִ�.
			}
		}
		System.out.println("�Է��Ͻ� ���� ����� : " + (double)sum/input.length + "�Դϴ�.");	
	}
	
	public void exercise4() {
		Scanner sc = new Scanner(System.in);
		int [] input = new int[5];
		int max = 0;
		System.out.println("���� ���� 5���� �Է��ϼ���.");
		
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			if(input[i] > 0) {
				if(max < input[i]) {
					max = input[i];
				}
			}else if(input[i] < 0) { // ���� ������ �ƴϸ� ����Ǵ� �κ�
				System.out.println("�ٽ� �Է��ϼ���.");
				i--; // i�� 1 �ٿ��־�� �ٽ� �Է¹��� �� �ִ�.
			}
		}
		
		System.out.println("�Է��Ͻ� �� �� ���� ū ���� [" + max + "]�Դϴ�.");
	}
	
	public void exercise5() {
		/*
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		 * ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �ϳ��� �Է��ϼ���. : ");
		String memberNum = sc.next();
		char [] origin = new char[14];
		char [] copy = new char[14]; // ���� ������ ����!
		//char [] copy = origin; ���� ����, �̷��� �ǵ��� ���� �ƴϴ�!
		
		//�����ڸ� ���������� �Է¹��� memberNum���� ���ڸ��� �߶� �־��ְ� �����ڸ� ���Ĵ� *�� origin�迭�� �������ش�.
		for(int i = 0; i < origin.length; i++) {
				origin[i] = memberNum.charAt(i);
				System.out.print(origin[i]);
		}
		
		System.out.println();
		
		//�Է¹��� �ֹι�ȣ�� copy�迭�� �������ָ鼭 ���� ���ķ� *�� �������ش�.
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i];
			}else{
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		
		
	}
	
	public void exercise6() {
		int [] nums = {1, 2, 3, 4, 5}; // �Ҵ�� �ʱ�ȭ ���ÿ�
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		//forEach������ �ٲٱ�
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	
	public void exercise7() {
		String [] fruits = {"����", "������", "����", "ü��", "����"};
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		
		System.out.println();
		
		//forEach������ �ٲٱ�		
		for(String fruit  : fruits) {
			System.out.print(fruit + " ");
		}
	}
}
