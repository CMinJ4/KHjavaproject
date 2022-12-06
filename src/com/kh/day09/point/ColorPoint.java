package com.kh.day09.point;

public class ColorPoint extends Point{
	private String color; // ���� ��
	
	//�⺻������
	//�⺻������ ������, �⺻�����ڸ� ����Ϸ��� �ϸ� ������ ����. 
	//ColorPointEX���� ������ �߻��� �� ����.
	//public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		//x, y ����
		super(x, y);
		// Point�� ������ Point(x,y) ȣ��
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { // ��, ��ǥ ���
		System.out.println(color);
		showPoint(); // PointŬ������ showPoint�� ȣ��
	}
}
