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
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 정보저장(save)");
			System.out.println("4. 정보불러오기(load)");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력 : ");
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
				System.out.println("프로그램을 종료합니다.");
				break end;
			default : break;
			}
			
			System.out.println();
		}
	}
	
	
	
	static String insert() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("이름 : ");
		str += sc.nextLine();
		System.out.print("나이 : ");
		str += "/" + sc.nextLine();
		System.out.print("주소 : ");
		str += "/" + sc.nextLine();
		
		System.out.println(str);
		return str;
	}
	
	static void print(String data) {
		String [] printData = data.split("/");
		System.out.println("이름 : " + printData[0]);
		System.out.println("나이 : " + printData[1]);
		System.out.println("주소 : " + printData[2]);
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
