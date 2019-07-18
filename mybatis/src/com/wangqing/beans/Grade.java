package com.wangqing.beans;

import java.util.List;

public class Grade {
	private int gradeId;
	private String gradeInfo;
	private List<Student> students;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(int gradeId, String gradeInfo, List<Student> students) {
		super();
		this.gradeId = gradeId;
		this.gradeInfo = gradeInfo;
		this.students = students;
	}
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeInfo() {
		return gradeInfo;
	}
	public void setGradeInfo(String gradeInfo) {
		this.gradeInfo = gradeInfo;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Grade [gradeId=" + gradeId + ", gradeInfo=" + gradeInfo + ", student s=" + students + "]";
	}
	
	
}
