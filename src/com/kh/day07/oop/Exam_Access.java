package com.kh.day07.oop;

class Sample { //�����ڰ� ����Ʈ��
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String [] args) {
		Sample aClass = new Sample();
		aClass.a = 10; // ���� �����Ѵ�. public�̱� ����.
		// aClass.b = 10; // is not visible, �Ұ����ϴ� private�̴ϱ�
		aClass.c = 10; // ���ٰ����ϴ�. default�ϱ�
	}
}
