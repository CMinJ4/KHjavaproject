package com.kh.practice.condition;

import java.util.Scanner;

/*	�����Ǻ�1
	Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�,
	����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 
	0�� �ƴϸ� �������١��� ����ϼ���.

	ex.
	���� : -9
	������
 */
public class Practice_If1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		String result = ""; 
		
		if(input == 0) {
			result = "0";
		}else if(input > 0) {
			result = "���";
		}else if(input < 0) {
			result = "����";
		}
		
		System.out.println("�Է��Ͻ� [" + input + "]��/�� [" + result +"]�Դϴ�.");
	
	}
}
