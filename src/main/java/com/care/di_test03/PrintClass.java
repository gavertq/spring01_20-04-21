package com.care.di_test03;

import java.util.ArrayList;

public class PrintClass {
	public void print(String name, ArrayList<String> food) {
		System.out.println("이름: "+name);
		for(int i = 0; i<food.size(); i++) {
			System.out.println("음식 "+(i+1)+"번: "+food.get(i));
		}

	}
}
