//�ڵ� ����ȯ �ǽ�
//����Ÿ���� ūŸ���� ������ ūŸ������ �ڵ���ȯ�Ǿ� ����� �̷������.
package com.kh.day03.typetrans;

public class TestTypeTrans1 {
	public static void main(String [] args) {
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;
		
		System.out.println("result : " + result);
		System.out.println("���� �� ��ȯ : " + (int)result); //����Ÿ������ ���� �� ��ȯ�� �����ϴ�.
		System.out.println("���� �� ��ȯ : " + (char)65);
	}
}
