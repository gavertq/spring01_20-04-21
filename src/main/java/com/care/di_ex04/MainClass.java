package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

//import com.care.di_ex03.SaveClass;

public class MainClass {

	public static void main(String[] args) {
		//Car car = new Controller02();	//Controller01 사용.. Controller02 쓰려면 여기로 와서 수정해야 함
		
		//추후에 자동으로 연결해주는 방법 배울 것
		String conf = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		Car car = ctx.getBean("car", Car.class);	
		//
		
		System.out.println("메인 클래스 속력을 냅니다.");
		car.speed();
		
		SubClass sb = new SubClass();
		sb.subFunc();
	}

}
