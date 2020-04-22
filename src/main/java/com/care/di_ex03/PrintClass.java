package com.care.di_ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintClass {
	public void print(String name, ArrayList<String> hobby, HashMap<String, String> weather) {
		System.out.println("ÀÌ¸§: "+name);
		System.out.println("hobby 0: "+hobby.get(0));
		System.out.println("hobby 1: "+hobby.get(1));
		System.out.println("¿À´Ã ³¯¾¾: "+weather.get("¿À´Ã"));
		System.out.println("³»ÀÏ ³¯¾¾: "+weather.get("³»ÀÏ"));
	}
}
