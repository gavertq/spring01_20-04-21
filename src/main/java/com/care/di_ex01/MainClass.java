package com.care.di_ex01;

public class MainClass {
	public static void main(String[] args) {
		STBean st = new STBean();
		st.setName("김하나");
		st.setAge(20);
		st.setSt(new Student());	//의존 관계를 보여주기 위한 코드. 직접 get,set을 이용하는게 아님.
		
		st.namePrint();
		st.agePrint();
	}
}
