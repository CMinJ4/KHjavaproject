package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		int i = 1; // while �� ������ ���� ����
		int result = 0; // ������� ������ ����
		
		while (i <= 100) { // 1 ~ 100���� ���ư�
			/*
			if(i%2 == 1) { // 2�� ������ �������� 1�̸� ����. �� Ȧ���̸� ����
				result += i; // result ���� �ȿ� result + i�� ���� ������
			}
			i++; // i �� 1 ������Ŵ
			*/
			result += i;
			i += 2; // 1���� 2�� �����ϸ� ��� Ȧ����
		}
		
		System.out.println("1 ~ 100 ������ Ȧ���� �J�� : " + result + "�Դϴ�."); // ������
	}
}

/*
	���մ��Կ�����
	i = i + 1; -> i += 1;
	i = i * 4; -> i *= 4;
*/