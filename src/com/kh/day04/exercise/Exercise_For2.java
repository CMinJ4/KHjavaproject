package com.kh.day04.exercise;

public class Exercise_For2 {
	public static void main(String [] args) {
		//1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		
		int result = 0; //������� ������ ����
		
		for(int i = 1; i <= 10; i++) {
			result += i;//result ���� �ȿ� 1 ���� 10���� ���� ���� �������ش�.
			System.out.print(i);//���ڸ� ������ִ� �κ� 

			if(i <= 9) { // ���� 1 ~ 10 ���̿� +��� ���ڸ� �־��ֱ� ���� ������ ����
				System.out.print(" + ");//+�� ������ִ� �κ� ������ 10 �ڿ��� ������� �ʴ´�.
			}else {
				System.out.print(" = ");
			}
		}
		System.out.println(result);//������� ����ϴ� �κ�
	}
}
