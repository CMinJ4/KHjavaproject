package com.kh.day07.oop;


class StaticSample{
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	
	public void goodMethod() {
		input = 30;
	}
	
	public static int input; // ������ �Ʒ��� �������� Ŭ������ �ε�ɶ� static ���п� ���� ������ �Ǳ� ������ ������ input������ ����ص� ������ �ȳ�
	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {
	public static void main(String [] args) {
		new StaticSample().num = 10; // num ������ static�� �ƴϱ� ������ new�� �ٿ��� ������־�� �Ѵ�.
		StaticSample.input = 10; // input ������ static���� �����Ǿ� �ֱ� ������ new ���� �ٷ� ����� �����ϴ�.
		
		StaticSample s1; // s1��ü ����
		s1 = new StaticSample();
		System.out.println(s1.input);
		s1.originMethod();
		//StaticSample.originMethod(); �̷��� �ٷ� ����ص���
		System.out.println(s1.input);
		
		int value = Math.abs(-5);
		System.out.println("�� : " + value);
	}
}
