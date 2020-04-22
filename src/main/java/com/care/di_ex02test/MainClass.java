package com.care.di_ex02test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String config = "classpath:application_ex02test.xml";
		GenericXmlApplicationContext cont = new GenericXmlApplicationContext(config);
		
		PrintBean pb = cont.getBean("pb", PrintBean.class);
		//System.out.println("입력하세요: ");
		//pb.setPrint(new Scanner(System.in).next());
		pb.printString();
	}
}
