package com.kh.day07.Student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() { // �ʱ�ȭ�� ����
		
	}
	
	// setter �޼ҵ�
	// ������� ���� �ʱ�ȭ
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
	
	// getter�޼ҵ�
	// ������� �� ����
	// �Ʒ� �޼ҵ���� private �������� �ٸ� Ŭ�������� ����� �� �ְ� �������
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
