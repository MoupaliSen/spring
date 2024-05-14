package com.mou.sprincores.e2;

public class Student {
	public Student(int roll, String name, Education education) {
		super();
		this.roll = roll;
		this.name = name;
		this.education = education;
	}
	private int roll;
	private String name;
	private Education education;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "Student's roll=" + roll + ", name=" + name + ", education=" + education;
	}
	

}
