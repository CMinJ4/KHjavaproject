package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String [] args) {
		String query = "name=kite&addr=seoul&age=21";
		//String [] words = query.split("&"); -> �迭�� ����¹��
		StringTokenizer st = new StringTokenizer(query, "&=");
		//& �Ǵ� = �������� ������ �и��Ѵ�.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
