//Scanner�� �̿��Ͽ� �ǽ��ϱ�. 
//������ �Է¹޾� ����ϱ�
package com.kh.day03.exscanner;
import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		/*
		�̸��� �Է����ּ���. // next()
		�¾ ���� �Է����ּ���. int
		Ű�� �Է����ּ���. int
		������ �Է����ּ���. char
		�ּҸ� �Է����ּ���. // nextLine()
		
		�̸��� �κ����Դϴ�.
		�¾ ���� 9�Դϴ�.
		Ű�� 180.0�Դϴ�.
		������ ���Դϴ�.
		�ּҴ� ����� ���α��Դϴ�.
		*/
		
		System.out.println("*Scanner ���� �ǽ�����*");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();
		
		System.out.println("�¾ ���� �Է����ּ���.");
		int month = sc.nextInt();
		
		System.out.println("Ű�� �Է����ּ���.");
		double height = sc.nextDouble();
				
		System.out.println("������ �Է����ּ���.");
		char gender = sc.next().charAt(0);
		
		System.out.println("�ּҸ� �Է����ּ���.");
		sc.nextLine(); //�������� ���� ���־�� �Ʒ� nextLine�� ���������� ������
		String adress = sc.nextLine();//���͸� �Է��� �ޱ� ������ ���͸� ġ�� �Է����� �ν��� �ع���
		
		System.out.println();
		System.out.println();
		
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�Դϴ�.");
		System.out.println("Ű�� " + height + "�Դϴ�.");
		System.out.println("������ " + gender + "�Դϴ�.");
		System.out.println("�ּҴ� " + adress + "�Դϴ�.");
	}
}
