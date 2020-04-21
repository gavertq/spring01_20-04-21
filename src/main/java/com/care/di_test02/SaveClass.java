package com.care.di_test02;

public class SaveClass {
	private int num1, num2, result;	//입력받을 숫자1, 입력받을 숫자2, 결과값 변수
	private String op;				//입력받을 연산자 변수
	private PrintClass pc;			//출력 객체
	private OperationClass oc;		//연산 객체
	
	public void operationClass() { result = oc.operation(num1, num2, op);}	//result = 연산결과
	public void printClass() {	pc.printFunc(num1, op, num2, result);}		//출력
	
	public int getNum1() {return num1;}
	public void setNum1(int num1) {	this.num1 = num1;}
	
	public int getNum2() {return num2;}
	public void setNum2(int num2) {	this.num2 = num2;}
	
	public int getResult() {return result;}
	public void setResult(int result) {	this.result = result;}	
	
	public String getOp() {	return op;}
	public void setOp(String op) {	this.op = op;}
	
	//연산, 출력 객체 연결해줄 set,get
	public PrintClass getPc() {	return pc;}
	public void setPc(PrintClass pc) {	this.pc = pc;}
	
	public OperationClass getOc() {	return oc;}
	public void setOc(OperationClass oc) {	this.oc = oc;}	
	
}
