package com.kh.day07.score;

import java.util.Scanner;
//[Sysout] + [ctrl + space]
public class ScoreRun {
	public static void main(String [] args) {
		ScoreFunction sFun = new ScoreFunction(); // √ ±‚»≠
		
		go :
		while(true) {
			//int choice = sFun.printMenu();
			switch(sFun.printMenu()) {
			case 1 :
				sFun.inputScore();
				break;
			case 2 :
				sFun.printScore();
				break;
			case 3 :
				sFun.goodByeMsg();
				break go;
			default :
				sFun.exceptionMsg();
				break;
			}
		}
	}
}
