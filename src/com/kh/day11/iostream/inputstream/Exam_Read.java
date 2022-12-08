package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null;
		
		// Unhandled exception type FileNotFoundException -> Checked Exception
		// -> 반드시 try ~ catch 해줘야 하는 Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt"); // 외부에서 파일을 읽어옴
			int readByte;
			
			
			while(true) {
				readByte = is.read();
				// 없으면 그만 읽어!!
				if(readByte == -1) { // 더이상 데이터가 없을때가 -1 이다.
					break;
				}
				System.out.print((char)readByte);
			}
			//reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
