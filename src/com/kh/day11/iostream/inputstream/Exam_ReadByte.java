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
			int readByteNo; // �ܺ������� �о�� ����
			byte [] readBytes = new byte[3]; // ���ڹ迭
			// readBytes�� ���� ���� ���� ������. �迭�� 3��¥���� 5���ڰ� ��������� ó�� 3��ȯ ���� 2 ��ȯ
			String data ="";
			while((readByteNo = is.read(readBytes)) != -1) {
				//readByteNo = is.read(readBytes); // �迭�� ����
				//if(readByteNo == -1) {
				//	break;
				//}
				data += new String(readBytes, 0, readByteNo); // readBytes���� 0���� readByteNo���� ���ڸ� �о��.
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
