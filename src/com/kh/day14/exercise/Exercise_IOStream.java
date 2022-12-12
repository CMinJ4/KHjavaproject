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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public static void main(String [] args) {

		String inputData = "";
		
		end:
		while(true) {
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ��������(save)");
			System.out.println("4. �����ҷ�����(load)");
			System.out.println("0. ����");
			System.out.print("�޴� �Է� : ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			
			switch(input){
			case 1 : 
				inputData = insert();
				System.out.println(inputData);
				break;
			case 2 :
				print(inputData); 
				break;
			case 3 : 
				save(inputData); 
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
	
	
	
	static String insert() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("�̸� : ");
		str += sc.nextLine();
		System.out.print("���� : ");
		str += "/" + sc.nextLine();
		System.out.print("�ּ� : ");
		str += "/" + sc.nextLine();
		
		System.out.println(str);
		return str;
	}
	
	static void print(String data) {
		String [] printData = data.split("/");
		System.out.println("�̸� : " + printData[0]);
		System.out.println("���� : " + printData[1]);
		System.out.println("�ּ� : " + printData[2]);
		System.out.println();
	}
	
	static void save(String name) {
		String [] nameData = name.split("/");
		Writer writer = null;
		try {
			writer = new FileWriter("src/com/kh/day14/exercise/" + nameData[0] + ".txt");
			for(int i = 0; i < nameData.length; i++) {
				writer.write(nameData[i] + "/");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void load() {
		
	}
}
