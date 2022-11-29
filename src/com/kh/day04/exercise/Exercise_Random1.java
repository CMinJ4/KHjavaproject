package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args) {
		// 동전 앞뒤 맞추기!!
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int win = 0, lose = 0, count = 0; // 승리, 패배, 게임수를 저장하기 위한 변수 선언과 초기화
		
		while(true) { // 무한루프로 게임을 진행함.
			System.out.println("=-=-=-=-=-= 동전 앞 뒤 맞추기 =-=-=-=-=-=");
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면 / 3.끝내기.) : ");
			int input = sc.nextInt(); // 사용자에게 정수를 입력받음
			
			if(input == 3) { // 입력받은 정수가 3이면 게임을 끝냄
				System.out.println("총 [" + count + "]번 게임을 진행했습니다."); // 게임수 출력
				System.out.println("승리 [" + win + "]번, 패배 [" + lose + "]번"); // 승리, 패배수 출력
				System.out.println("승률 : " + (double)win/count*100 + "%"); // 승률 출력
				System.out.println("프로그램을 종료합니다.");
				break;//while문을 종료시킴
			}
			
			if(input != 1 && input != 2) { // 입력받은 정수가 1이나 2 가 아닐시 출력
				System.out.println("1또는 2의 숫자를 입력해주세요.");
				System.out.println();
			}else { // 입력받은 정수가 1이나 2이면 랜덤수와 비교
				// 1 ~ 2 -> 2에서 1을 빼준다음 1을 더해줌 = 1
				int randomNum = rand.nextInt(2)+1;
				
				System.out.println("컴퓨터    : " + randomNum);
				System.out.println("플레이어  : " + input);
				
				count++; // 게임 진행수 증가
				
				if(input == randomNum) { 
					System.out.println("맞췄습니다.");
					win++;//승리수 증가
				}else{
					System.out.println("틀렸습니다.");
					lose++;//패배수 증가
				}
				
				System.out.println();
				System.out.println();
			}
		}
	}
}
