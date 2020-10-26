package com.home2;



import com.home.MethodTest;

public class MethodTest2 {
	public MethodTest2() {
		
	}
	
	//무반환 무파람
	public void sayHello() {
		System.out.println("hello~hi~");
	}
	//무반환 유파람
	public void printScore(String name, int score) {
		System.out.println(name + " "+ score +"점");
	}
	//유반환 무파람 기본8,참조
	public boolean getBoolean() {
		return true;
	}
	public char getChar() {
		return 'a';
	}
	public byte getByte() {
		return 127;
	}
	public short getShort() {
		return 32767;
	}
	public int getInt() {
		return 2100000000;
	}
	public long getLong() {
		return 2200000000L;
	}
	public float getFloat() {
		return 3.14f;
	}
	public double getDouble() {
		return 3.141592;
	}
	// 다른클래스 참조
	public MethodTest getPrint() {
		return new MethodTest();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
