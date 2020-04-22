package com.care.di_test03;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String conf = "classpath:application_Student.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		//xml���� ������ ��ü sc ����
		StudentClass sc = ctx.getBean("sc",StudentClass.class);		
		//food�� xml���Ͽ��� �ʱ�ȭ �ϰԵǸ� �ʿ���� �κ�
		ArrayList<String> food = new ArrayList<String>();
		food.add("1");		food.add("2");		food.add("3");		
		sc.setFood(food);
		//		
		sc.execute();
		
		//xml���� ������ ��ü sc02 ����
		StudentClass sc02 = ctx.getBean("sc02",StudentClass.class);
		sc02.execute();
	}

}
