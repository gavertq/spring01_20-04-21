package com.care.di_test03;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String conf = "classpath:application_Student.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		//xml에서 생성한 객체 sc 연결
		StudentClass sc = ctx.getBean("sc",StudentClass.class);		
		//food를 xml파일에서 초기화 하게되면 필요없는 부분
		ArrayList<String> food = new ArrayList<String>();
		food.add("1");		food.add("2");		food.add("3");		
		sc.setFood(food);
		//		
		sc.execute();
		
		//xml에서 생성한 객체 sc02 연결
		StudentClass sc02 = ctx.getBean("sc02",StudentClass.class);
		sc02.execute();
	}

}
