package com.care.di_ex01;

public class MainClass {
	public static void main(String[] args) {
		STBean st = new STBean();
		st.setName("���ϳ�");
		st.setAge(20);
		st.setSt(new Student());	//���� ���踦 �����ֱ� ���� �ڵ�. ���� get,set�� �̿��ϴ°� �ƴ�.
		
		st.namePrint();
		st.agePrint();
	}
}
