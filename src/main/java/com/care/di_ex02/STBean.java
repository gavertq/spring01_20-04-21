package com.care.di_ex02;

public class STBean {
	private String name;
	private int age;
	private Student student;

	public void namePrint() {student.namePrint(name);}	
	public void agePrint() {student.agePrint(age);}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	public Student getSt() {return student;}
	public void setSt(Student student) {this.student = student;}
	
}
