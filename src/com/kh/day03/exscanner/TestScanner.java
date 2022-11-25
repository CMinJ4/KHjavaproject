//Scanner를 이용하여 실습하기. 
//정보를 입력받아 출력하기
package com.kh.day03.exscanner;
import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		/*
		이름을 입력해주세요. // next()
		태어난 월을 입력해주세요. int
		키를 입력해주세요. int
		성별을 입력해주세요. char
		주소를 입력해주세요. // nextLine()
		
		이름은 민봉식입니다.
		태어난 월은 9입니다.
		키는 180.0입니다.
		성별은 남입니다.
		주소는 서울시 종로구입니다.
		*/
		
		System.out.println("*Scanner 복습 실습예제*");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		
		System.out.println("태어난 월을 입력해주세요.");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해주세요.");
		double height = sc.nextDouble();
				
		System.out.println("성별을 입력해주세요.");
		char gender = sc.next().charAt(0);
		
		System.out.println("주소를 입력해주세요.");
		sc.nextLine(); //엔터제거 위에 써주어야 아래 nextLine가 정상적으로 동작함
		String adress = sc.nextLine();//엔터를 입력을 받기 때문에 엔터를 치면 입력으로 인식을 해버림
		
		System.out.println();
		System.out.println();
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("주소는 " + adress + "입니다.");
	}
}
