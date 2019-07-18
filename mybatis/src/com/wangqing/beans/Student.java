package com.wangqing.beans;

public class Student {
	private Integer id;
	private String name;
	private int age;
	private double score;
	private int gradeId;
	
	public Student(String name, int age, double score, int gradeId) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.gradeId = gradeId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + ", gradeId=" + gradeId
				+ "]";
	}
	
}
