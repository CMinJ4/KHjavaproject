package com.kh.day04.exercise;
//���� ����Ű : ctrl + d -> ���پ� ���� �� ����

public class Exercise_PrintSample {
	public static void main(String []args) {
		/*
		System.out.println ����
		���� + ���ڿ� -> ���ڿ�
		*/
		System.out.println(1 + "1"); //-> ��� 11 �տ� 1�� ����, �ڿ� ���� 1�� ����
		
		// ���� + ���� -> ����
		System.out.println('1' + '1');
		
		// ���� + ���� + ���ڿ� + ���� -> ���ڿ�
		System.out.println(10 + 20 + "Hello" + 7);
		
		//printf�� ���Ͽ� �˾ƺ���
		//println, print -> �ٹٲ��� ���̰� �ִ�.
		System.out.print("���� �Է� : "); // �ٷ� ���� �Է¹���.
		System.out.println();//�ٹٲ�
		System.out.println("���� �Է� : "); // �ٹٲٰ� �Է¹���.
		int num1 = 100;
		System.out.printf("���� ��� : %d %d\n",20, num1); // ������� \n�� prinf���� �ٹٲ��� ������ �մϴ�.
		String words = "World";
		System.out.printf("���ڿ� ��� : %s %s","Hello" , words); // ���ڿ� ���
	}
}
