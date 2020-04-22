package com.care.di_ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class SaveClass {
	
	private PrintClass pc;	
	private String name;
	private ArrayList<String> hobby;
	private HashMap<String, String> weather;	
	
	public SaveClass() {}	//xml파일에서 객체 생성할 때 발생할 수 있는 오류 방지
	public SaveClass(String name, ArrayList<String> hobby, HashMap<String, String> weather) {//applicationPC.xml의 객체 sc02값 적용을 위함
		this.name = name;
		this.hobby = hobby;
		this.weather = weather;
	}
	
	public void pcFunc() {	pc.print(name, hobby, weather);	}
	
	
	public PrintClass getPc() {return pc;}
	public void setPc(PrintClass pc) {this.pc = pc;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public ArrayList<String> getHobby() {return hobby;}
	public void setHobby(ArrayList<String> hobby) {this.hobby = hobby;}
	
	public HashMap<String, String> getWeather() {return weather;}
	public void setWeather(HashMap<String, String> weather) {this.weather = weather;}
	
}
