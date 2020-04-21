package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		STBean st = ctx.getBean("stb",STBean.class);	//����� STBean st�� �����Ѵ� = (applicationST.xml���� ������ stb ��ü ������, �� ��ü�� Ŭ������ STBean�̴�)
		
		st.setName("�����");
		st.setAge(25);
		//st.setSt(new Student());
		
		st.namePrint();
		st.agePrint();
		
		//new���� ���� ��ü�� �ȿ� �ִ� ���(set�� ��¸޼ҵ�)��� ����
	}
}
