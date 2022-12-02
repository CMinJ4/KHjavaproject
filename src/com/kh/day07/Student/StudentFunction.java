package com.kh.day07.Student;

import java.util.Scanner;

public class StudentFunction {
	
	Student student;
	
	public StudentFunction() { // 초기화를 해줌
		student = new Student();
	}
	/**
	 * 학생관리 프로그램 메뉴 출력
	 * @return choice
	 */
	public int printMnue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	/**
	 * 학생 성적 입력
	 * @return choice
	 */
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 정보 입력 ======");
		System.out.println("학생 이름 입력 : ");
		student.setName(sc.next());
		System.out.println("국어점수 입력 : ");
		student.setKor(sc.nextInt());
		System.out.println("영어점수 입력 : ");
		student.setEng(sc.nextInt());
		System.out.println("수학점수 입력 : ");
		student.setMath(sc.nextInt());
		
	}
	/**
	 * 학생 정보 출력
	 * @return choice
	 */
	public void printScore() {
		int sum = student.getKor() + student.getEng() + student.getMath();
		double avg = (double)sum/3;
		
		System.out.println("====== 학생 정보 출력 ======");
		System.out.println(student.getName() + "학생의 성적");
		System.out.println("국어 성적 : " + student.getKor());
		System.out.println("영어 성적 : " + student.getEng());
		System.out.println("수학 성적 : " + student.getMath());
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		System.out.println();
		System.out.println("============================");
		
	}
	
	public void goofByeMsg() {
		System.out.println("Good Bye~");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 3 사이의 수를 입력해주세요!");
	}
}
