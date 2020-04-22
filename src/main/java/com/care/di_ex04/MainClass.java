package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

//import com.care.di_ex03.SaveClass;

public class MainClass {

	public static void main(String[] args) {
		//Car car = new Controller02();	//Controller01 ���.. Controller02 ������ ����� �ͼ� �����ؾ� ��
		
		//���Ŀ� �ڵ����� �������ִ� ��� ��� ��
		String conf = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		Car car = ctx.getBean("car", Car.class);	
		//
		
		System.out.println("���� Ŭ���� �ӷ��� ���ϴ�.");
		car.speed();
		
		SubClass sb = new SubClass();
		sb.subFunc();
	}

}
