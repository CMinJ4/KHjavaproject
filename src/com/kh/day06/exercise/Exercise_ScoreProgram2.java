package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	static Scanner sc = new Scanner(System.in);
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	static int choice = 0;
	
	public static void main(String [] args) {
		go :
		while(true) {
			printMenu();
			switch(choice) {
			case 1 :
				inputScore();
				break;
			case 2 :
				printScore();
				break;
			case 3 :
				goodByeMsg();
				break;
			default :
				printException();
				break go;
			}
		}
	}
	

	
	public static void printMenu() {
		System.out.println("====== ���� �޴� =======");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		choice = sc.nextInt();
		
	}
	
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ���� �Է� ======");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
	}
	
	public static void printScore() {
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		
		System.out.println("====== ���� ��� =======");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println();

		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f", avg);
		System.out.println();
	}
	
	public static void goodByeMsg() {
		System.out.println("Good Bye~");
	}
	
	public static void printException() {
		System.out.println("1 ~ 3 ������ ���� �Է����ּ���!");
	}
}
