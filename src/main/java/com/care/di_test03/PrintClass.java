package com.care.di_test03;

import java.util.ArrayList;

public class PrintClass {
	public void print(String name, ArrayList<String> food) {
		System.out.println("�̸�: "+name);
		for(int i = 0; i<food.size(); i++) {
			System.out.println("���� "+(i+1)+"��: "+food.get(i));
		}

	}
}
