package com.kh.day07.Student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() { // 초기화를 해줌
		
	}
	
	// setter 메소드
	// 멤버변수 각각 초기화
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// getter메소드
	// 멤버변수 값 리턴
	// 아래 메소드들은 private 변수들을 다른 클래스에서 사용할 수 있게 만들어줌
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}

}
