package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		STBean stBean = ctx.getBean("stb",STBean.class);	//����� STBean st�� �����Ѵ� = (applicationST.xml���� ������ stb ��ü ������, �� ��ü�� Ŭ������ STBean�̴�)
		
		//stBean.setName("�輭��");
		//stBean.setAge(30);
		//st.setSt(new Student());
		
		stBean.namePrint();
		stBean.agePrint();
		
		//new���� ���� ��ü�� �ȿ� �ִ� ���(set�� ��¸޼ҵ�)��� ����
	}
}
