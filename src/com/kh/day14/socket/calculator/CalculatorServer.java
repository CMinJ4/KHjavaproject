package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 1. 서버소켓 만들어주기
// 2. 포트번호 만들어주기
// 3. 서버소켓에 포트번호 넣어주기
// 4. 소켓을 만들어서 서버.accept로 접속 받기

public class CalculatorServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int port = 8989;
		
		try {
			System.out.println("서버 구동중입니다.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			while(true) {
				// 받은 메시지 : 12 + 1
				String msg = dis.readUTF();
				System.out.println("받은 메시지 : " + msg);
				
				if(msg.equalsIgnoreCase("bye")) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				// 연산결과 보내기
				String [] msgArrs = msg.split(" ");
				
				if(msgArrs.length != 3) {
					msg = "end";
					dos.writeUTF(msg);
					continue;
				}
				
				int num1 = Integer.parseInt(msgArrs[0]);
				String operator = msgArrs[1];
				int num2 = Integer.parseInt(msgArrs[2]);
				String result = "";
				
				switch(operator) {
				case "+" : result = num1 + num2 + ""; break;
				case "-" : result = String.valueOf(num1 - num2); break;
				case "*" : result = String.valueOf(num1 * num2); break;
				case "/" : result = String.valueOf(num1 / num2); break;
				case "%" : result = String.valueOf(num1 % num2); break;
				default : result = "연산자를 잘못입력하셨습니다."; break;
				}
				
				dos.writeUTF(result);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
				dis.close();
				dos.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
