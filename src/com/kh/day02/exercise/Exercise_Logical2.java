package com.kh.day02.exercise;
import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		System.out.println("*������ �������� 2��*");
		System.out.println();
		/*
		 * ���� A�� �빮������ �ҹ������� Ȯ���ϼ���!
		 * ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		 * ���� �빮�� Ȯ�� : true
		 */
		
		//char word = 'A';
		String Sword;
		boolean result1;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Ȯ���� ���ĺ��� �Է����ּ��� : ");
		char word = sc1.next().charAt(0);
			
		//�ƽ�Ű�ڵ�ǥ�� ���ؼ� ����� Ȯ���Ѵ� ���� 91 �̸��� �빮�� 91�̻��� �ҹ����̴�.
		//result1 = (word > 64) && (word < 91);
		//System.out.println("���� �빮�� Ȯ�� : " + result1);
		
		if((word > 64) && (word < 91)) {
			System.out.println("�빮�ڰ� �½��ϴ�.");
		}else {
			System.out.println("�빮�ڰ� �ƴմϴ�.");
		}
	}
}