package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String [] args) {
		String query = "name=kite&addr=seoul&age=21";
		//String [] words = query.split("&"); -> 배열을 만드는방법
		StringTokenizer st = new StringTokenizer(query, "&=");
		//& 또는 = 기준으로 내용을 분리한다.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
