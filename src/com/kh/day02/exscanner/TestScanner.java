package com.kh.day02.exscanner;
import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//print, println �ٹٲ� ���蹮���� ���� �� ���� ���ǿ��
		System.out.print("int ���� �Է����ּ��� : ");
		int input1 = sc.nextInt();
		System.out.println("�Է��� �� : " + input1);
		
		System.out.print("int ���� �ѹ� �� �Է����ּ��� : ");
		int input2 = sc.nextInt();
		System.out.println("d�Է��� �� : " + input2);
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� : " + result+"�Դϴ�.");
		sc.close(); // ��Ʈ���� �� ����ϰ� ������ ���ִ� �ڵ���. ���� ��������� ����.
	}
}
