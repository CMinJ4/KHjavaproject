package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		// 두 값을 계산해서 출력하시오
		// 결과 : 20
		int result = Integer.valueOf(strNum2) - Integer.valueOf(strNum);
		System.out.println(result);
	}
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		//1. strData를 byte, short, int, long으로 변환하시오.
		//2. strData2를 float, double로 변환하시오.
		//3. strData3을 char로 변환하시오.
		
		byte strDataB = Byte.parseByte(strData);
		short strDataS = Short.parseShort(strData);
		int strDataI = Integer.parseInt(strData);
		long strDataL = Long.parseLong(strData);
		
		float strData2F = Float.parseFloat(strData2);
		double strData2D = Double.parseDouble(strData2);
		
		// toCharArray로 출력하기
		char [] strData3C = strData3.toCharArray();
		for(char c : strData3C) {
			System.out.print(c);
		}
		
		System.out.println();
		
		// charAt으로 출력하기
		for(int i = 0; i < strData3.length(); i++) {
			System.out.print(strData3.charAt(i));
		}
	}	
}

