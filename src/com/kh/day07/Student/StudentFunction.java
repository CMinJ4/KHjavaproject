package com.kh.day07.Student;

import java.util.Scanner;

public class StudentFunction {
	
	Student student;
	
	public StudentFunction() { // �ʱ�ȭ�� ����
		student = new Student();
	}
	/**
	 * �л����� ���α׷� �޴� ���
	 * @return choice
	 */
	public int printMnue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �л� ���� ���� ���α׷� =======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}
	/**
	 * �л� ���� �Է�
	 * @return choice
	 */
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �л� ���� �Է� ======");
		System.out.println("�л� �̸� �Է� : ");
		student.setName(sc.next());
		System.out.println("�������� �Է� : ");
		student.setKor(sc.nextInt());
		System.out.println("�������� �Է� : ");
		student.setEng(sc.nextInt());
		System.out.println("�������� �Է� : ");
		student.setMath(sc.nextInt());
		
	}
	/**
	 * �л� ���� ���
	 * @return choice
	 */
	public void printScore() {
		int sum = student.getKor() + student.getEng() + student.getMath();
		double avg = (double)sum/3;
		
		System.out.println("====== �л� ���� ��� ======");
		System.out.println(student.getName() + "�л��� ����");
		System.out.println("���� ���� : " + student.getKor());
		System.out.println("���� ���� : " + student.getEng());
		System.out.println("���� ���� : " + student.getMath());
		System.out.println();
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f", avg);
		System.out.println();
		System.out.println("============================");
		
	}
	
	public void goofByeMsg() {
		System.out.println("Good Bye~");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 3 ������ ���� �Է����ּ���!");
	}
}
