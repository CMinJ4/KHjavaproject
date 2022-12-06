package com.kh.day09.point;

public class ColorPoint extends Point{
	private String color; // 점의 색
	
	//기본생성자
	//기본생성자 없을때, 기본생성자를 사용하려고 하면 오류가 난다. 
	//ColorPointEX에서 오류가 발생할 수 있음.
	//public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		//x, y 셋팅
		super(x, y);
		// Point의 생성자 Point(x,y) 호출
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { // 색, 좌표 출력
		System.out.println(color);
		showPoint(); // Point클래스의 showPoint를 호출
	}
}
