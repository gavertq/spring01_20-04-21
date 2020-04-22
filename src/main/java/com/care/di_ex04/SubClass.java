package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		//Car car = new Controller02();	//Controller01 ���.. Controller02 ������ ����� �ͼ� �����ؾ� ��
		String conf = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("���� Ŭ������ �ӷ��� ���ϴ�.");
		car.speed();
	}
}
