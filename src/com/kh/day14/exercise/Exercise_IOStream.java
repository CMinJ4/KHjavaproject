		// 1. 정보입력
		// 2. 정보출력
		// 3. 정보저장(save)
		// 4. 정보불러오기(load)
		// 0. 종료
		// 메뉴 입력 : 1
		
		// 이름 입력 : 일용자
		// 나이 입력 : 33
		// 주소 입력 : 서울시 종로구
		
		// 메뉴 입력 : 2
		
		// 이름 : 일용자
		// 나이 : 33
		// 주소 : 서울 종로구
		
		// 3. 선택하여 저장 후 파일을 열어보면
		// 단, 파일의 이름은 이름으로 한다.
		// 일용자.txt -> 일용자/33/서울시 종로구
		// 이용자.txt -> 이용자/22/서울시 중구
		// 삼용자.txt -> 삼용자/11/서울시 서대문구
		
		// 4. 선택 후 파일의 제목을 입력하여 로드한 후에
		// 2. 선택하면 정보가 출력됨
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
				System.out.println("프로그램을 종료합니다.");
				break end;
			default : break;
			}
			
			System.out.println();
		}
	}
	
	static int printMenu() {
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save)");
		System.out.println("4. 정보불러오기(load)");
		System.out.println("0. 종료");
		System.out.print("메뉴 입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine(); // 엔터값을 없애줌
		System.out.print("주소 : ");
		address = sc.nextLine();
	}
	
	static void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
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
			System.out.println("저장 완료 되었습니다.");
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void load() {
		Scanner sc = new Scanner(System.in);
		System.out.print("불러올 파일 이름 : ");
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
			System.out.println("로드가 완료되었습니다!!");
			System.out.println();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
