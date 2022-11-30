package com.kh.day06.exercise;
import java.util.Scanner;

public class Exercise_ScoreProgram {
	public void 프린트기능() {
		
	}
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0, kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0;
		ESCAPE : //레이블명 (반복문이 오기전에 선언되어야한다.) 변수와 마찬가지로 이름은 자유롭게 설정할 수 있다.

		while(true){
			System.out.println("====== 메인 메뉴 =======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			choice = sc.nextInt();

			switch(choice) {
				case 1 :
					System.out.println("====== 성적 입력 ======");
					System.out.print("국어 : ");
					kor = sc.nextInt();
					System.out.print("영어 : ");
					eng = sc.nextInt();
					System.out.print("수학 : ");
					math = sc.nextInt();
					break;

				case 2 :
					sum = kor+eng+math;
					avg = (double)(kor+eng+math)/3;
					
					System.out.println("====== 성적 출력 =======");
					System.out.println("국어 : " + kor);
					System.out.println("영어 : " + eng);
					System.out.println("수학 : " + math);

					System.out.println();

					System.out.println("총점 : " + sum);
					System.out.printf("평균 : %.2f", avg);
					System.out.println();
					break;
					
				case 3 :
					System.out.println("Good Bye~");
					break ESCAPE; //레이블명인 label이 적혀있는곳까지 강제로 탈출한다.
				default :
					System.out.println("1 ~ 3 사이의 수를 입력해주세요~");
					break;
			} 
		}

		/* if문을 이용해서 구현하기
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int korScore = 0, engScore = 0, mathScore = 0;
		
		while(true) {
			System.out.println("====== 메인 메뉴 =======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			System.out.println();
			
			if(choice == 1) {
				System.out.println("====== 성적 입력 =======");
				System.out.print("국어 : ");
				korScore = sc.nextInt();
				System.out.print("영어 : ");
				engScore = sc.nextInt();
				System.out.print("수학 : ");
				mathScore = sc.nextInt();
				System.out.println();
				
			}else if(choice == 2) {
				System.out.println("====== 성적 출력 =======");
				System.out.println("국어 : " + korScore);
				System.out.println("영어 : " + engScore);
				System.out.println("수학 : " + mathScore);
				
				System.out.println();
				
				System.out.println("총점 : " + (korScore+engScore+mathScore));
				System.out.println("평균 : " + (double)(korScore+engScore+mathScore)/3);
				System.out.println();
				
			}else if(choice == 3) {
				System.out.println("Good Bye~~");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			}
			
		}
		*/
	}
}

