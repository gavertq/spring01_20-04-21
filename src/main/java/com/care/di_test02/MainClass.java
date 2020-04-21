package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//스캐너
		Scanner scn = new Scanner(System.in);
		
		//xml연결
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext cont = new GenericXmlApplicationContext(config);		
		SaveClass sc = cont.getBean("sc", SaveClass.class);
		
		//값 입력 받기
		System.out.print("숫자1 입력: ");		
		sc.setNum1(scn.nextInt());
		
		System.out.print("숫자2 입력: ");
		sc.setNum2(scn.nextInt());
		
		System.out.print("연산자 입력: ");
		sc.setOp(scn.next());
		
		//계산, 결과 출력
		sc.operationClass();
		sc.printClass();
		
		//스캐너 닫기
		scn.close();
	}

}
