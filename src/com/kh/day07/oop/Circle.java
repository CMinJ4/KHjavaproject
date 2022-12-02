package com.kh.day07.oop;

public class Circle { // Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
	// ---�ʵ�---
	//���������� : public
	public int radius; // ���� ������ �ʵ�(��������, Ŭ��������, �������, �ʵ庯��)
	public String name; // ���� �̸� �ʵ�
	
	// ---�޼ҵ�---
	// Ŭ������� �̸��� ���� �޼ҵ�
	// -> ������ : �ʵ带 �ʱ�ȭ���ִ� ������ �Ѵ�. ��������
	//���������� : public
	public Circle() { // ���� ������ �޼ҵ�
		//Ŭ������ �̸��̰��� �޼ҵ��
		//��ü�� ���� ���ش�
		//�ʵ��� ���� �ʱ�ȭ ���ش�(�ʱ�ȭ�� �����ڿ�)
		this.radius = 1;
		this.name = "��";
	}
	
	//���������� : public
	//��ȯ���� �ִ� �޼ҵ�(��ȯ���� ����, return)
	public double getArea() {
		return 3.14*radius*radius;
		// ������ ���� �Ⱦ����� ���̰� ����.
		// double area = 3.14*radius*radius;
		// return area;
	}
}
