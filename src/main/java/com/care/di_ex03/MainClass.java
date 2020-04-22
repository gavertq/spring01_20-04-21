package com.care.di_ex03;

//import java.util.ArrayList;
//import java.util.HashMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String conf = "classpath:applicationPC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		//객체 sc
		SaveClass sc = ctx.getBean("sc", SaveClass.class);				
		/* 직접 값 초기화해서 설정
		ArrayList<String> hobby = new ArrayList<String>();
		HashMap<String, String> weather = new HashMap<String, String>();
		hobby.add("게임");	hobby.add("웹툰");
		weather.put("오늘", "바람 춥다");		weather.put("내일", "덥다");
		sc.setName("하나"); sc.setHobby(hobby); sc.setWeather(weather);*/		
		
		//메소드 pcFunc실행
		sc.pcFunc();
		
		//객체 sc02
		SaveClass sc02 = ctx.getBean("sc02", SaveClass.class);	
		sc02.pcFunc();
	}

}
