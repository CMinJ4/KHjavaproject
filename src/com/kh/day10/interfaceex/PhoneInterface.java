package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = "";
	// name = "Hello World"; -> ���� �������ϴ°� �Ұ�����.(�������)
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public abstract void printLogo();
	void displayNumber();
	public default void showLogo() { // ����Ʈ �޼ҵ�
		// ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		// ��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}
}
