package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student [] students;
	
	public StudentFunction() {
		students = new Student[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �л� ���� Ȯ�� ���α׷� ======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i++) {
			System.out.println("====== " + (i+1) + "�л� ���� �Է� ======");
			students[i] = new Student();
			
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next();
			students[i].setName(name);
			
			System.out.print("1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			students[i].setFirstScore(firstScore);
			
			System.out.print("2�� ���� �Է� : ");
			int secondScore = sc.nextInt();
			students[i].setSecondScore(secondScore);
			System.out.println();
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("====== " + (i+1) + "��° �л� ���� ��� ======");
			System.out.println(students[i].getName() + "�л��� ������");
			System.out.println("1�� ���� : " + students[i].getFirstScore() + ", 2�� ���� : " + students[i].getSecondScore() + "�Դϴ�.");
			System.out.println();
		}
	}
	
	public void checkPass() {
		/*
			0. ������ ���δ� 1��, 2���� ���� �ٸ���.
			1. ������ ������ 40�� �̸��� ��� �������� ���� ����ڰ� �ȴ�.
			2. 1�� ������ 2�� ������ ����� 60���� �Ѿ�� �Ѵ�.
			3. 1�� ������ 2�� ������ ����� 60�� �̸��� ���� ���ؼ� ���򰡸� ����.
			- ���� -
			��� 60�� '�̻�'�϶� 40�� '�̸�'�� ���� ����
			��� 60�� '�̸�'�϶� 60�� '�̸�'�� ���� ���� 
		 */
		for(int i = 0; i < students.length; i++) {
			int num1 = students[i].getFirstScore(); //ù��° ���輺��
			int num2 = students[i].getSecondScore(); //�ι�° ���輺��
			int avg = (num1 + num2) / (students.length-1); //��ձ��ϱ�
			String check1 = "���", check2 = "���"; //���, ���� �����ϴ� ����
			
			if(avg <= 60) { // ��� 60�� ����
				if(num1 < 60) { // ù��° ���� 60�� ����
					check1 = "����";
				}
				if(num2 < 60) { // ù��° ���� 60�� ����
					check2 = "����";
				}
			}else{ // ��� 60�� �̻�
				if(num1 < 40) { // ù��° ���� 40�� ����
					check1 = "����";
				}
				if(num2 < 40) { // ù��° ���� 40�� �̻�
					check2 = "����";
				}
			}
			
			//System.out.println(avg);
			System.out.println(students[i].getName() + "�л��� ���� ����");
			System.out.println("1�� ���� : [" + check1 + "], 2�� ���� : [" + check2 + "]�Դϴ�.");
			System.out.println();
		}
		
	}
	
	public void printGoodBye() {
		System.out.println("Good Bye~");
	}
	
	public void printException() {
		System.out.println("�ٽ� �Է��ϼ���!");
	}
}
