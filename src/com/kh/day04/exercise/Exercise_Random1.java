package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args) {
		// ���� �յ� ���߱�!!
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int win = 0, lose = 0, count = 0; // �¸�, �й�, ���Ӽ��� �����ϱ� ���� ���� ����� �ʱ�ȭ
		
		while(true) { // ���ѷ����� ������ ������.
			System.out.println("=-=-=-=-=-= ���� �� �� ���߱� =-=-=-=-=-=");
			System.out.print("���ڸ� �Է����ּ��� (1.�ո� / 2.�޸� / 3.������.) : ");
			int input = sc.nextInt(); // ����ڿ��� ������ �Է¹���
			
			if(input == 3) { // �Է¹��� ������ 3�̸� ������ ����
				System.out.println("�� [" + count + "]�� ������ �����߽��ϴ�."); // ���Ӽ� ���
				System.out.println("�¸� [" + win + "]��, �й� [" + lose + "]��"); // �¸�, �й�� ���
				System.out.println("�·� : " + (double)win/count*100 + "%"); // �·� ���
				System.out.println("���α׷��� �����մϴ�.");
				break;//while���� �����Ŵ
			}
			
			if(input != 1 && input != 2) { // �Է¹��� ������ 1�̳� 2 �� �ƴҽ� ���
				System.out.println("1�Ǵ� 2�� ���ڸ� �Է����ּ���.");
				System.out.println();
			}else { // �Է¹��� ������ 1�̳� 2�̸� �������� ��
				// 1 ~ 2 -> 2���� 1�� ���ش��� 1�� ������ = 1
				int randomNum = rand.nextInt(2)+1;
				
				System.out.println("��ǻ��    : " + randomNum);
				System.out.println("�÷��̾�  : " + input);
				
				count++; // ���� ����� ����
				
				if(input == randomNum) { 
					System.out.println("������ϴ�.");
					win++;//�¸��� ����
				}else{
					System.out.println("Ʋ�Ƚ��ϴ�.");
					lose++;//�й�� ����
				}
				
				System.out.println();
				System.out.println();
			}
		}
	}
}
