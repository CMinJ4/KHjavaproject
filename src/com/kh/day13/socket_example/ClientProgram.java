package com.kh.day13.socket_example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String [] args) {
		Socket socket = null;
		// 데이터 보낼 때 사용해야 하는 스트림은? 출력스트림!
		OutputStream os = null;
		InputStream is = null;
		
		try {
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결성공!!");
			
			//- 데이터 보내기 -------------------//
			byte [] buf = null;
			String message = "";
			os = socket.getOutputStream();
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			//-----------------------------------//
			
			//- 데이터 받기 ---------------------//
			is =socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			//-----------------------------------//
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
