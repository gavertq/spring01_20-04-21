package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		//Car car = new Controller02();	//Controller01 사용.. Controller02 쓰려면 여기로 와서 수정해야 함
		String conf = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("서브 클래스도 속력을 냅니다.");
		car.speed();
	}
}
