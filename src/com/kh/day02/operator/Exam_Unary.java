package com.kh.day02.operator;
//연산자 실습

public class Exam_Unary {
	public static void main(String [] args) {
		//이항연산자
		//1 + 2, 2 X 3, 4 / 2 
		
		//단항연산자
		//a++, a--, b++, b--
		//++a, --a, ++b, --b
		int num= 1;
		
		/*
		System.out.println(num++); // 후위연산(나중연산)
		System.out.println(num);
		System.out.println(++num); // 전위연산(먼저연산)
		*/
		
		System.out.println("*단항연산자 실습*");
		System.out.println();

		//1번 문제-----------------------
		System.out.println("1번 문제");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b);");
		
		int a = 10, b = 20, c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
		
		System.out.println();
		System.out.println();
		
		//2번 문제-----------------------
		System.out.println("2번 문제");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y;");
		
		int x = 100, y = 33, z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		
		System.out.println();
		System.out.println();
		
		//부정연산자-------------------------------
		System.out.println("*부정연산자 실습*");
		System.out.println();
		boolean result = true;
		System.out.println("result의 값 :" + result );
		System.out.println("result의 값 :" + !result ); // !를 앞에 붙이면 부정값이 됨
		System.out.println("result의 값 :" + !!result ); // 부정의 부정은 긍정이다.
	
	}
}
