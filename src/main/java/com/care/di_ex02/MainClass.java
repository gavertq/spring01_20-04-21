package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		STBean st = ctx.getBean("stb",STBean.class);	//결과를 STBean st에 저장한다 = (applicationST.xml에서 생성한 stb 객체 가져옴, 그 객체의 클래스는 STBean이다)
		
		st.setName("김두이");
		st.setAge(25);
		//st.setSt(new Student());
		
		st.namePrint();
		st.agePrint();
		
		//new없이 만든 객체로 안에 있는 기능(set과 출력메소드)사용 가능
	}
}
