package com.home;

import com.home2.MethodTest2;

public class MainEx {
	public static void main(String[] args) {
	
		MethodTest mt = new MethodTest();
		
		mt.printHello();
		mt.printName("È«±æµ¿");
		mt.printNameScore("È«±æµ¿", 100);
		mt.call("±èÀ»µ¿","±èµ¿",200);
		
		System.out.println(":::::::::::::::::::::::");
		
		MethodTest2 mTest2 = new MethodTest2();
		
		mTest2.sayHello();
		mTest2.printScore("±èÁÂÁø", 99);
		boolean b1 = mTest2.getBoolean();
		System.out.println(b1);
		char c1 = mTest2.getChar();
		System.out.println(c1);
		byte b2 = mTest2.getByte();
		System.out.println(b2);
		short s1 = mTest2.getShort();
		System.out.println(s1);
		int i1 = mTest2.getInt();
		System.out.println(i1);
		long l1 = mTest2.getLong();
		System.out.println(l1);
		float f1 = mTest2.getFloat();
		System.out.println(f1);
		double d1 = mTest2.getDouble();
		System.out.println(d1);
		MethodTest mt1 = mTest2.getPrint();
		System.out.println(mt1);
		System.out.println(mTest2);
		System.out.println(mt);
		
		
		
	}

}
