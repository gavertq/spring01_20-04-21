package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//��ĳ��
		Scanner scn = new Scanner(System.in);
		
		//xml����
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext cont = new GenericXmlApplicationContext(config);		
		SaveClass sc = cont.getBean("sc", SaveClass.class);
		
		//�� �Է� �ޱ�
		System.out.print("����1 �Է�: ");		
		sc.setNum1(scn.nextInt());
		
		System.out.print("����2 �Է�: ");
		sc.setNum2(scn.nextInt());
		
		System.out.print("������ �Է�: ");
		sc.setOp(scn.next());
		
		//���, ��� ���
		sc.operationClass();
		sc.printClass();
		
		//��ĳ�� �ݱ�
		scn.close();
	}

}
