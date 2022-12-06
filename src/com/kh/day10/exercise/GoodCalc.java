package com.kh.day10.exercise;

// 추상클래스를 상속받기 위해서는 오버라이딩을 해주거나,
// 똑같이 추상클래스로 만들어주어야한다.
public class GoodCalc extends Calculator{

	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc();
		
		int [] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println("더하기 : " + calc.add(1, 2));
		System.out.println("빼  기 : " + calc.substract(5, 2));
		System.out.println("평  균 : " + calc.average(num));
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum/a.length;
	}


}