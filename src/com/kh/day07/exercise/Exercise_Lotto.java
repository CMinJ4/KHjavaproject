package com.kh.day07.exercise;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise_Lotto {
	public void LottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기!!
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 몇개? 6개!!
		// 로또 번호의 번위는? 1 ~ 45
		
		Scanner sc = new Scanner(System.in);
		System.out.print("로또번호를 몇번 생성할까요? : ");
		int input = 0;
		Random rand = new Random();
		int [] lottoNum = new int[6];
		
		
		while(true) {// 입력받은 값이 숫자인지 확인하기 위한 반복문
			try {// 예외처리 (입력받은값이 숫자가 아니여서 발생하는 오류를 체크
				input = sc.nextInt();
				break;
			}catch(InputMismatchException e){ // 입력받은값이 '문자'일때 실행함
				System.out.println("숫자를 입력해주세요!");
				sc.next();//입력받은값을 초기화해줌 이 부분이 있어야 다시 입력받을 수 있다.
			}
		}
		
		
		for(int k = 0; k < input; k++) {
			System.out.println(k+1 + "번째 로또 번호입니다.");
			// 번호 6개를 랜덤으로 받아옴
			// 번호 6개가 중복이 있는지 테스트함
			for(int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = (rand.nextInt(45)+1); // 1 ~ 45 사이의 랜덤한 숫자를 받아옴
				
				if(i != 0) { // 첫번째 실행(비교할 필요 없음)이 아니면 실행
					for(int j = 0; j < i; j++) {
						if(lottoNum[i] == lottoNum[j]) { // 중복된 숫자가 있으면 i를 다시 뒤로 돌려서 다시 랜덤한 숫자를 받을 수 있게 만듬
							i--;
							break;//같으면 바로 다음 숫자 비교를 위해 효율을 높이기 위해
						}
					}				
				}
			}
			
			
			//오름차순정렬
			int num = 0;
			for(int i = 0; i < lottoNum.length; i++) { // 총 6번 비교를함
				for(int j = i + 1; j < lottoNum.length; j++) { // 
					if(lottoNum[i] > lottoNum[j]) {
						num = lottoNum[i];
						lottoNum[i] = lottoNum[j];
						lottoNum[j] = num;
					}
				}
			}
			
			//로또번호 출력
			for(int i = 0; i < 6; i++) {
				System.out.print( "["+ lottoNum[i] + "]");				
			}
			System.out.println();
			System.out.println();
		}		
	}
}
