package com.kh.day09.insof;

public class InstanceOfEx {
	static void print(Person p) {
		//if(p instanceof Person)
			//System.out.println("Person입니다!");
		if(p instanceof Student)
			System.out.println("Student입니다!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!");
		
		System.out.println();
	}
	
	public static void main(String [] args) {
		//print(new Person());
		print(new Student()); //업캐스팅
		print(new Researcher());
		print(new Professor());
	}
		
}
