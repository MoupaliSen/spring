package com.mou.sprincores.e2;

public class Education {
	public Education(String courseName, String specalisation, int duration) {
		super();
		this.courseName = courseName;
		this.specalisation = specalisation;
		this.duration = duration;
	}
	private String courseName;
	private String specalisation;
	private int duration;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSpecalisation() {
		return specalisation;
	}
	public void setSpecalisation(String specalisation) {
		this.specalisation = specalisation;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "courseName=" + courseName + ", specalisation=" + specalisation + ", duration=" + duration
				+ "years";
	}
	

}
