package com.home2;



import com.home.MethodTest;

public class MethodTest2 {
	public MethodTest2() {
		
	}
	
	//����ȯ ���Ķ�
	public void sayHello() {
		System.out.println("hello~hi~");
	}
	//����ȯ ���Ķ�
	public void printScore(String name, int score) {
		System.out.println(name + " "+ score +"��");
	}
	//����ȯ ���Ķ� �⺻8,����
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
	// �ٸ�Ŭ���� ����
	public MethodTest getPrint() {
		return new MethodTest();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
