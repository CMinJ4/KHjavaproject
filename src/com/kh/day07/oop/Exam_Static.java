package com.kh.day07.oop;


class StaticSample{
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	
	public void goodMethod() {
		input = 30;
	}
	
	public static int input; // 선언을 아래에 적었지만 클래스가 로드될때 static 덕분에 먼저 선언이 되기 때문에 위에서 input변수를 사용해도 오류가 안남
	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {
	public static void main(String [] args) {
		new StaticSample().num = 10; // num 변수가 static이 아니기 때문에 new를 붙여서 사용해주어야 한다.
		StaticSample.input = 10; // input 변수는 static으로 설정되어 있기 때문에 new 없이 바로 사용이 가능하다.
		
		StaticSample s1; // s1객체 생성
		s1 = new StaticSample();
		System.out.println(s1.input);
		s1.originMethod();
		//StaticSample.originMethod(); 이렇게 바로 사용해도됨
		System.out.println(s1.input);
		
		int value = Math.abs(-5);
		System.out.println("값 : " + value);
	}
}
