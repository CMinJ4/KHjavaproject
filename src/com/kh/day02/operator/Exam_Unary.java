package com.kh.day02.operator;
//������ �ǽ�

public class Exam_Unary {
	public static void main(String [] args) {
		//���׿�����
		//1 + 2, 2 X 3, 4 / 2 
		
		//���׿�����
		//a++, a--, b++, b--
		//++a, --a, ++b, --b
		int num= 1;
		
		/*
		System.out.println(num++); // ��������(���߿���)
		System.out.println(num);
		System.out.println(++num); // ��������(��������)
		*/
		
		System.out.println("*���׿����� �ǽ�*");
		System.out.println();

		//1�� ����-----------------------
		System.out.println("1�� ����");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b);");
		
		int a = 10, b = 20, c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		
		System.out.println();
		System.out.println();
		
		//2�� ����-----------------------
		System.out.println("2�� ����");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y;");
		
		int x = 100, y = 33, z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);
		
		System.out.println();
		System.out.println();
		
		//����������-------------------------------
		System.out.println("*���������� �ǽ�*");
		System.out.println();
		boolean result = true;
		System.out.println("result�� �� :" + result );
		System.out.println("result�� �� :" + !result ); // !�� �տ� ���̸� �������� ��
		System.out.println("result�� �� :" + !!result ); // ������ ������ �����̴�.
	
	}
}
