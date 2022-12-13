		// 1. �����Է�
		// 2. �������
		// 3. ��������(save)
		// 4. �����ҷ�����(load)
		// 0. ����
		// �޴� �Է� : 1
		
		// �̸� �Է� : �Ͽ���
		// ���� �Է� : 33
		// �ּ� �Է� : ����� ���α�
		
		// �޴� �Է� : 2
		
		// �̸� : �Ͽ���
		// ���� : 33
		// �ּ� : ���� ���α�
		
		// 3. �����Ͽ� ���� �� ������ �����
		// ��, ������ �̸��� �̸����� �Ѵ�.
		// �Ͽ���.txt -> �Ͽ���/33/����� ���α�
		// �̿���.txt -> �̿���/22/����� �߱�
		// �����.txt -> �����/11/����� ���빮��
		
		// 4. ���� �� ������ ������ �Է��Ͽ� �ε��� �Ŀ�
		// 2. �����ϸ� ������ ��µ�
package com.kh.day14.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {
	private static String name;
	private static int age;
	private static String address;
	
	
	public static void main(String [] args) {

		String inputData = "";
		
		end:
		while(true) {
			
			int input = printMenu();
			
			
			switch(input){
			case 1 : 
				insert();
				break;
			case 2 :
				print(); 
				break;
			case 3 : 
				save(); 
				break;
			case 4 : 
				load(); 
				break;
			case 0 : 
				System.out.println("���α׷��� �����մϴ�.");
				break end;
			default : break;
			}
			
			System.out.println();
		}
	}
	
	static int printMenu() {
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������(save)");
		System.out.println("4. �����ҷ�����(load)");
		System.out.println("0. ����");
		System.out.print("�޴� �Է� : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� : ");
		age = sc.nextInt();
		sc.nextLine(); // ���Ͱ��� ������
		System.out.print("�ּ� : ");
		address = sc.nextLine();
	}
	
	static void print() {
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("====== ========= ======");
		System.out.println();
	}
	
	static void save() {
		Writer os = null;
		try {
			String result = name + "/" + age +"/" + address;
			os = new FileWriter("src/iostream/" + name + ".txt");
			os.write(result);
			os.flush();
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void load() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҷ��� ���� �̸� : ");
		String fileName = sc.nextLine();
		String result = "";
		
		Reader reader = null;
		BufferedReader bfReader = null;
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			result = bfReader.readLine();
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			address = st.nextToken();
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ�!!");
			System.out.println();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
