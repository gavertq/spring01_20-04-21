package com.care.di_test03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String conf = "classpath:application_Student.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		StudentClass sc = ctx.getBean("sc",StudentClass.class);
		
		sc.execute();
	}

}
