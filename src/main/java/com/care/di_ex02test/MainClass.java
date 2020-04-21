package com.care.di_ex02test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_ex02test.xml";
		GenericXmlApplicationContext cont = new GenericXmlApplicationContext(config);
		
		PrintBean pb = cont.getBean("pb", PrintBean.class);
		pb.setPrint("결과 출력");
		pb.printString();
	}
}
