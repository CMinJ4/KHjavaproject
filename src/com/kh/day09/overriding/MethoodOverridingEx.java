package com.kh.day09.overriding;

public class MethoodOverridingEx {
	
	static void paint(Shape p) {
		// Shap p = new Line();
		p.draw();
	}
	
	public static void main(String [] args) {
		Line line = new Line();
		line.draw();
		paint(line); // ���� �θ��� draw�� ����Ǿ�� ������ �������ε� �Ǿ���.
		paint(new Rect());
		paint(new Circle());
	}
}