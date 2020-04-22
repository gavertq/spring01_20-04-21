package com.care.di_test03;

import java.util.ArrayList;

public class StudentClass implements Student {
	
	private String name;
	private ArrayList<String> food;
	private PrintClass pc;
	
	@Override
	public void execute() {	//PrintClass의 출력 부분으로 이동하는 기능을 담당한다.
		pc.print(name, food);
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public ArrayList<String> getFood() {return food;}
	public void setFood(ArrayList<String> food) {this.food = food;}

	public PrintClass getPc() {return pc;}
	public void setPc(PrintClass pc) {this.pc = pc;}			
	
}
