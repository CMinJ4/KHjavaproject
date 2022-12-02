package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student [] students;
	
	public StudentFunction() {
		students = new Student[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 성적 확인 프로그램 ======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i++) {
			System.out.println("====== " + (i+1) + "학생 정보 입력 ======");
			students[i] = new Student();
			
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			students[i].setName(name);
			
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			students[i].setFirstScore(firstScore);
			
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			students[i].setSecondScore(secondScore);
			System.out.println();
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("====== " + (i+1) + "번째 학생 정보 출력 ======");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println("1차 점수 : " + students[i].getFirstScore() + ", 2차 점수 : " + students[i].getSecondScore() + "입니다.");
			System.out.println();
		}
	}
	
	public void checkPass() {
		/*
			0. 재평가의 여부는 1차, 2차가 각각 다르다.
			1. 각각의 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다.
			2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 한다.
			3. 1차 점수와 2차 점수의 평균이 60점 미만의 과목에 대해서 재평가를 본다.
			- 정리 -
			평균 60점 '이상'일때 40점 '미만'인 과목만 재평가
			평균 60점 '미만'일때 60점 '미만'인 과목만 재평가 
		 */
		for(int i = 0; i < students.length; i++) {
			int num1 = students[i].getFirstScore(); //첫번째 시험성적
			int num2 = students[i].getSecondScore(); //두번째 시험성적
			int avg = (num1 + num2) / (students.length-1); //평균구하기
			String check1 = "통과", check2 = "통과"; //통과, 재평가 저장하는 변수
			
			if(avg <= 60) { // 평균 60점 이하
				if(num1 < 60) { // 첫번째 과목 60점 이하
					check1 = "재평가";
				}
				if(num2 < 60) { // 첫번째 과목 60점 이하
					check2 = "재평가";
				}
			}else{ // 평균 60점 이상
				if(num1 < 40) { // 첫번째 과목 40점 이하
					check1 = "재평가";
				}
				if(num2 < 40) { // 첫번째 과목 40점 이상
					check2 = "재평가";
				}
			}
			
			//System.out.println(avg);
			System.out.println(students[i].getName() + "학생의 재평가 여부");
			System.out.println("1차 시험 : [" + check1 + "], 2차 시험 : [" + check2 + "]입니다.");
			System.out.println();
		}
		
	}
	
	public void printGoodBye() {
		System.out.println("Good Bye~");
	}
	
	public void printException() {
		System.out.println("다시 입력하세요!");
	}
}
