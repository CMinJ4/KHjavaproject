package com.kh.day03.typetrans;

public class TestTypeTrans2 {
	public static void main(String [] args) {
		byte b = 127;	// 1byte
		int i = 100;	// 4byte
		
		//�ڵ� ����ȯ -> ���� �ڷ����� ū �ڷ������� �ڵ����� ��ȯ��
		System.out.println(b+i); // ����b �� int�� �ڵ� �� ��ȯ �Ǿ ����
		System.out.println(10/4); // �翬�� 2 ����� ����
		System.out.println(10.0/4); // 4 -> 4.0���� �ڵ� �� ��ȯ�Ǿ� ����
		
		System.out.println();
		System.out.println();
		
		//���� ����ȯ -> ū �ڷ����� ���� �ڷ������� ��ȯ, ������ �ս� �߻�!!
		System.out.println((char)0x12340041);
		System.out.println((byte)(b + i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
