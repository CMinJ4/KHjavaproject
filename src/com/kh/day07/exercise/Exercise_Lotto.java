package com.kh.day07.exercise;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise_Lotto {
	public void LottoProgram() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�!!
		// ��, ����� ������������ ����
		// �ζ� ��ȣ�� �? 6��!!
		// �ζ� ��ȣ�� ������? 1 ~ 45
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ζǹ�ȣ�� ��� �����ұ��? : ");
		int input = 0;
		Random rand = new Random();
		int [] lottoNum = new int[6];
		
		
		while(true) {// �Է¹��� ���� �������� Ȯ���ϱ� ���� �ݺ���
			try {// ����ó�� (�Է¹������� ���ڰ� �ƴϿ��� �߻��ϴ� ������ üũ
				input = sc.nextInt();
				break;
			}catch(InputMismatchException e){ // �Է¹������� '����'�϶� ������
				System.out.println("���ڸ� �Է����ּ���!");
				sc.next();//�Է¹������� �ʱ�ȭ���� �� �κ��� �־�� �ٽ� �Է¹��� �� �ִ�.
			}
		}
		
		
		for(int k = 0; k < input; k++) {
			System.out.println(k+1 + "��° �ζ� ��ȣ�Դϴ�.");
			// ��ȣ 6���� �������� �޾ƿ�
			// ��ȣ 6���� �ߺ��� �ִ��� �׽�Ʈ��
			for(int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = (rand.nextInt(45)+1); // 1 ~ 45 ������ ������ ���ڸ� �޾ƿ�
				
				if(i != 0) { // ù��° ����(���� �ʿ� ����)�� �ƴϸ� ����
					for(int j = 0; j < i; j++) {
						if(lottoNum[i] == lottoNum[j]) { // �ߺ��� ���ڰ� ������ i�� �ٽ� �ڷ� ������ �ٽ� ������ ���ڸ� ���� �� �ְ� ����
							i--;
							break;//������ �ٷ� ���� ���� �񱳸� ���� ȿ���� ���̱� ����
						}
					}				
				}
			}
			
			
			//������������
			int num = 0;
			for(int i = 0; i < lottoNum.length; i++) { // �� 6�� �񱳸���
				for(int j = i + 1; j < lottoNum.length; j++) { // 
					if(lottoNum[i] > lottoNum[j]) {
						num = lottoNum[i];
						lottoNum[i] = lottoNum[j];
						lottoNum[j] = num;
					}
				}
			}
			
			//�ζǹ�ȣ ���
			for(int i = 0; i < 6; i++) {
				System.out.print( "["+ lottoNum[i] + "]");				
			}
			System.out.println();
			System.out.println();
		}		
	}
}
