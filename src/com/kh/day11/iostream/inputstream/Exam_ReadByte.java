package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String [] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByteNo; // 외부파일을 읽어올 변수
			byte [] readBytes = new byte[3]; // 문자배열
			// readBytes가 읽은 글자 수를 리턴함. 배열이 3개짜리라 5글자가 들어있을때 처음 3반환 다음 2 반환
			String data ="";
			while((readByteNo = is.read(readBytes)) != -1) {
				//readByteNo = is.read(readBytes); // 배열의 길이
				//if(readByteNo == -1) {
				//	break;
				//}
				data += new String(readBytes, 0, readByteNo); // readBytes에서 0에서 readByteNo까지 문자를 읽어옴.
			}
			System.out.println(data);
		}catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
					e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
