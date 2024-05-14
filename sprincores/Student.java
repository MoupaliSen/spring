package com.mou.sprincores;

public class Student {
	private int id;
	private String name;
	
	public Student() {
		System.out.println("No Data");
	}
	
	public Student(int id) {
		this.id = id;
		
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id+" "+name);
	}

}
