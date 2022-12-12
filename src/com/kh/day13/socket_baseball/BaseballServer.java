package com.kh.day13.socket_baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		Random rand = new Random();
		
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			Date date = new Date();
			System.out.println(trans.format(date));
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			// ��ȣ 3���� ���� �Ŀ� ���� �غ��ؾ���
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9)+1;
				// �ߺ�����
				for(int j = 0; j < i; j++) {
					if(numbers[i] == numbers[j]) {
						i--;
						break;
					}
				}
			}
			System.out.println("���� ���� -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("���� �غ� �Ϸ�");
			int strike = 0;
			int ball = 0;
			
			while(true) {
				// �� �ޱ�
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				// ���� ���� numbers�� ���� ������ ��
				// ���ڰ� �°� ��ġ�� �´���
				// ���ڴ� �´µ� ��ġ�� Ʋ����
				// �ƹ��͵� ���� �ʾҴ�����
				// ��Ʈ����ũ, ���� ������ش�.

				
				String [] readNums = readNum.split(" ");
				String result = "";
				for (int i = 0; i < numbers.length; i++) {
					for(int j = 0; j < readNums.length; j++) {
						if(numbers[i] == Integer.parseInt(readNums[j])) {
							if(i == j) {
								strike ++;
							}else {
								ball ++;
							}
						}
					}
				}
				result = strike + "��Ʈ����ũ " + ball + "��";
				dos.writeUTF(result);
				
				if(strike == 3) {
					System.out.println(result);
					System.out.println("�����մϴ�. �ƿ��Դϴ�!");
					break;
				}
				strike = 0;
				ball = 0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
