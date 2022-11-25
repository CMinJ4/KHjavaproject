package com.kh.day02.variable;
import java.util.Scanner; // Scanner�� ����ϱ� ���� ȣ��
//���� 

public class TestDataType {
	public static void main(String [] args) {
		/*	�ڷ��� ������ ���Կ����� ������ ;
		 	1. �ڷ����� ����
			����,	���ڿ� 
			int,	String
			���迡 ���� �� �ֱ� ������ �ϱⰡ �ʿ��ϴ�. ũ�Ⱑ ������?
		*/ 
		
		// ���� part
		byte bNum = 127; // byte�� -128 ~ 127 ���� ���� �� ����
		short sNum = 32767; //short��  - 32768 ~ 32767 ���� ���� �� ����
		int iNum = 2147483647; // int�� -2147483648 ~ 2147483647 ���� ���� �� ����
		long lNum = 2147483648l; // ���̻� l�� �ٿ�����.
		short num = 128; // 127�� �Ѿ�� ������ byte�� ����� �� ����.
		
		// �Ǽ� part
		float fNum = 22.1123f; // ���̻� f�� �ٿ�����.
		double dNum = 23.502; // ��� ���Ҷ� ���� ����Ұ�
		
		//���� part
		char fChar = 'A'; //' 'Ȭ����ǥ �ȿ��� 1���� ����
		String sChar = "Hello Java"; // �ֵ���ǥ �ȿ��� �������� ����
		
		//Boolean��
		boolean result = false; // ���̳� �����̳ĸ� ��Ÿ�� ������� ���.
		// 1>0, 2<1 ... 
		
		//�Է¹��� �� ����غ���
		System.out.println("������ �� : "+iNum);
		System.out.println("������ ��(9999��) : "+lNum);
		System.out.println("�Ǽ��� �� : "+fNum);
		System.out.println("�Ǽ��� �� : "+dNum);
		System.out.println("������ �� : "+fChar);
		System.out.println("���ڿ��� �� : "+sChar);
		System.out.println("���� �� : "+result);
		
		System.out.println();
		System.out.println();
		
		//ASCII(�ƽ�Ű) �ڵ�
		//����(char)�� ���ڸ� ������ �� �ְ� ASCII�ڵ忡 ���εǾ��ִ� ���ڷ� ����� �����ϴ�.
		fChar = 66;
		System.out.println(fChar);//B���
		
		fChar = 75;
		System.out.println(fChar);//K���
		
		
		System.out.println();
		System.out.println();
		
		//����ڷκ��� ���ڸ� �Է¹޾� 2���� 8���� 16������ �ٲ��ֱ�
		int num1;
		Scanner sc = new Scanner(System.in);//��ü����
		System.out.print("���ڸ� �Է��ϼ���. : ");
		num1 = sc.nextInt();
	
		String binaryString = Integer.toBinaryString(num1);
		String octalString = Integer.toOctalString(num1);
		String hexString = Integer.toHexString(num1);
		
		System.out.println(num1 + "�� 2���� �� : " + binaryString);
		System.out.println(num1 + "�� 8���� �� : " + octalString);
		System.out.println(num1 + "�� 16���� �� : " + hexString);
		
		
	}
}
