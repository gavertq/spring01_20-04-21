package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext cont = new GenericXmlApplicationContext(config);
		
		SaveClass sc = cont.getBean("sc", SaveClass.class);
		System.out.print("숫자1 입력: ");
		sc.setNum1(new Scanner(System.in).nextInt());
		System.out.print("숫자2 입력: ");
		sc.setNum2(new Scanner(System.in).nextInt());
		System.out.print("연산자 입력: ");
		sc.setOp(new Scanner(System.in).next());
		
		sc.operationClass();
		sc.printClass();
		
	}

}
