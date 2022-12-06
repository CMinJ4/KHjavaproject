package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		// Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		// The constructor Integer(int) is deprecated since version 9
		// �Ʒ�ó�� ����ϸ� �ȵ�. ���� 9 ���ķ� ����� ���
		//Integer i = new Integer(1123);
		
		Integer i = Integer.valueOf(1123);// ��ü
		int e = i.intValue(); //��ü���� �⺻������ ��ȯ�ؼ� ��� ����.
		Integer f = null; // -> ��ü�̱� ������ null ���� ���� �� �ִ�.(�⺻�������� �Ұ�)
		// int m = null;
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		// ���ڿ��� �⺻ ������ Ÿ��(int, boolean, double)���� ��ȯ
		int num = Integer.parseInt("123");
		int result = num + 1; // ���ڷ� ���ڸ� �޾Ƽ� ����Ҷ� ���
		System.out.println("��ȯ�� �� : " + num);
		boolean isyn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		// �⺻ ������ Ÿ��(int, double, char)�� ���ڿ��� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); // 16���� 7b�� ��ȯ
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);		
	}
}
