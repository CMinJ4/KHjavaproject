package com.kh.day06.exercise;
import java.util.Scanner;

public class Exercise_ScoreProgram {
	public void ����Ʈ���() {
		
	}
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0, kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0;
		ESCAPE : //���̺�� (�ݺ����� �������� ����Ǿ���Ѵ�.) ������ ���������� �̸��� �����Ӱ� ������ �� �ִ�.

		while(true){
			System.out.println("====== ���� �޴� =======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			choice = sc.nextInt();

			switch(choice) {
				case 1 :
					System.out.println("====== ���� �Է� ======");
					System.out.print("���� : ");
					kor = sc.nextInt();
					System.out.print("���� : ");
					eng = sc.nextInt();
					System.out.print("���� : ");
					math = sc.nextInt();
					break;

				case 2 :
					sum = kor+eng+math;
					avg = (double)(kor+eng+math)/3;
					
					System.out.println("====== ���� ��� =======");
					System.out.println("���� : " + kor);
					System.out.println("���� : " + eng);
					System.out.println("���� : " + math);

					System.out.println();

					System.out.println("���� : " + sum);
					System.out.printf("��� : %.2f", avg);
					System.out.println();
					break;
					
				case 3 :
					System.out.println("Good Bye~");
					break ESCAPE; //���̺���� label�� �����ִ°����� ������ Ż���Ѵ�.
				default :
					System.out.println("1 ~ 3 ������ ���� �Է����ּ���~");
					break;
			} 
		}

		/* if���� �̿��ؼ� �����ϱ�
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int korScore = 0, engScore = 0, mathScore = 0;
		
		while(true) {
			System.out.println("====== ���� �޴� =======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			choice = sc.nextInt();
			System.out.println();
			
			if(choice == 1) {
				System.out.println("====== ���� �Է� =======");
				System.out.print("���� : ");
				korScore = sc.nextInt();
				System.out.print("���� : ");
				engScore = sc.nextInt();
				System.out.print("���� : ");
				mathScore = sc.nextInt();
				System.out.println();
				
			}else if(choice == 2) {
				System.out.println("====== ���� ��� =======");
				System.out.println("���� : " + korScore);
				System.out.println("���� : " + engScore);
				System.out.println("���� : " + mathScore);
				
				System.out.println();
				
				System.out.println("���� : " + (korScore+engScore+mathScore));
				System.out.println("��� : " + (double)(korScore+engScore+mathScore)/3);
				System.out.println();
				
			}else if(choice == 3) {
				System.out.println("Good Bye~~");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
			}
			
		}
		*/
	}
}

