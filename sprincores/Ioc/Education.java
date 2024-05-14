package com.mou.sprincores.Ioc;

public class Education {
	int eid;
	String name;
	int salary;
	String dept;
	String email;
	public Education(int eid, String name, int salary, String dept, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.email = email;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
