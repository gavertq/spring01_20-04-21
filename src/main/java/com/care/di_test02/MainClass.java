package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext cont = new GenericXmlApplicationContext(config);
		
		SaveClass sc = cont.getBean("sc", SaveClass.class);
		System.out.print("����1 �Է�: ");
		sc.setNum1(new Scanner(System.in).nextInt());
		System.out.print("����2 �Է�: ");
		sc.setNum2(new Scanner(System.in).nextInt());
		System.out.print("������ �Է�: ");
		sc.setOp(new Scanner(System.in).next());
		
		sc.operationClass();
		sc.printClass();
		
	}

}
