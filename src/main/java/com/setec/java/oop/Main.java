package com.setec.java.oop;

 class Person {
	protected String name;
	protected int id;
	
	protected void display() {
		System.out.print("Hello rany cute");
	}
}


class Student extends Person{
	private String generation;
	private String classes;
	
	@Override
	protected void display() {
		System.out.print("Hello rany cute girl");
	}
}

class Teacher extends Person{
	private double salary;
	private String subject;
//	@Override
//	protected void display() {
//		System.out.print("Hello rany cute girl99");
//	}
}

public class Main{
	
	public static void main(String[] a){
		Student st = new Student();
		
		Teacher t = new Teacher();
		st.id=10;
		st.name ="54";
		st.display();
		
		t.display();
	}
}