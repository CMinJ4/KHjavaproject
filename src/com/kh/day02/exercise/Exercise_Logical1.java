package com.kh.day02.exercise;
import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		System.out.println("*������ �������� 1��*");
		System.out.println();
		/* �Է��� ������ 1 ~ 100 ������ �������� Ȯ���ϼ���!
		 * ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		 * 1���� 100������ �����ΰ�? : true
		 */
		
		boolean result1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ȯ���� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//System.out.println();
		//result1 = (1 <= num) && (100 >= num
		//System.out.println("1���� 100������ �����ΰ�? : " + result1);
		
		if(result1 = (1 <= num) && (100 >= num)) {
			System.out.println("1���� 100������ ���ڰ� �½��ϴ�.");
		}else{
			System.out.println("1���� 100������ ���ڰ� �ƴմϴ�.");
		}
		
		
	}
}
