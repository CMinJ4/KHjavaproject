package com.kh.day07.Student;

public class StudentRun {
	public static void main(String [] args) {
		StudentFunction sFunc = new StudentFunction();
		
		End:
			while(true) {
				int choice = sFunc.printMnue();
				switch(choice) {
					case 1 :
						sFunc.inputScore();
						break;
					case 2 : 
						sFunc.printScore();
						break;
					case 3 : 
						sFunc.goofByeMsg();
						break End;
					default : 
						sFunc.exceptionMsg();
						break;
				}
			}
		
	}
}
