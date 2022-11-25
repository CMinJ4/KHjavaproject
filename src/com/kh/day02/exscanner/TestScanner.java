package com.kh.day02.exscanner;
import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//print, println 줄바꿈 시험문제에 나올 수 있음 주의요망
		System.out.print("int 값을 입력해주세요 : ");
		int input1 = sc.nextInt();
		System.out.println("입력한 값 : " + input1);
		
		System.out.print("int 값을 한번 더 입력해주세요 : ");
		int input2 = sc.nextInt();
		System.out.println("d입력한 값 : " + input2);
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 : " + result+"입니다.");
		sc.close(); // 스트림을 다 사용하고 해제를 해주는 코드임. 당장 사용할일은 없음.
	}
}
