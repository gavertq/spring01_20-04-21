package com.care.di_ex04;

public class Controller01 implements Car{	//Car 인터페이스 구현

	@Override
	public void speed() {
		System.out.println("300km 속력을 냅니다.");
	}
	
}
