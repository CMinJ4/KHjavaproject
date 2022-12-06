package com.kh.day09.overriding;

public class MethoodOverridingEx {
	
	static void paint(Shape p) {
		// Shap p = new Line();
		p.draw();
	}
	
	public static void main(String [] args) {
		Line line = new Line();
		line.draw();
		paint(line); // 원래 부모의 draw가 실행되어야 하지만 동적바인딩 되었다.
		paint(new Rect());
		paint(new Circle());
	}
}