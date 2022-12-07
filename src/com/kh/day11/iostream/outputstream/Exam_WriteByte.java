package com.kh.day11.iostream.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Exam_WriteByte {
	public static void main(String [] args) {
		OutputStream os = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("저장할 문장을 입력하세요.");
//		String words = sc.next();
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Real I/O".getBytes();
			//byte [] data = words.getBytes();
			os.write(data);
			os.flush();
			System.out.println("쓰기완료~!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//----------------------------------------------------------
//		InputStream is = null;
//		
//		try {
//			is = new FileInputStream("src/iostream/outputStream.txt");
//			int readByteNo;
//			byte [] readBytes = new byte[8];
//			String data ="";
//			while((readByteNo = is.read(readBytes)) != -1) {
//				data += new String(readBytes, 0, readByteNo); // readBytes에서 0에서 readByteNo까지 문자를 읽어옴.
//			}
//			System.out.println(data);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
