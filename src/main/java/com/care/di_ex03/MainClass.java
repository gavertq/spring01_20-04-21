package com.care.di_ex03;

//import java.util.ArrayList;
//import java.util.HashMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String conf = "classpath:applicationPC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		//��ü sc
		SaveClass sc = ctx.getBean("sc", SaveClass.class);				
		/* ���� �� �ʱ�ȭ�ؼ� ����
		ArrayList<String> hobby = new ArrayList<String>();
		HashMap<String, String> weather = new HashMap<String, String>();
		hobby.add("����");	hobby.add("����");
		weather.put("����", "�ٶ� ���");		weather.put("����", "����");
		sc.setName("�ϳ�"); sc.setHobby(hobby); sc.setWeather(weather);*/		
		
		//�޼ҵ� pcFunc����
		sc.pcFunc();
		
		//��ü sc02
		SaveClass sc02 = ctx.getBean("sc02", SaveClass.class);	
		sc02.pcFunc();
	}

}
