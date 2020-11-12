package com.naver;

public class Test {
	
	public void me5() {
		String msg = "h";
		char c = msg.charAt(0);
		System.out.println(c);
	}
	
	public void me41() {
		String msg = "false";
		boolean b = Boolean.parseBoolean(msg);
		System.out.println(b);
		
		boolean b2 = Boolean.valueOf(msg);
	}
	
	public void me4() {
		String msg = "123";
		int i = Integer.parseInt(msg);
		System.out.println(i+10);
		System.out.println(msg+10);
		
		
	}
	
	public void me3() {
		//AutoUnBoxing
		boolean a = new Boolean(false);
		Character b = new Character('c');
		char bb = b;
	}
	
	public void me2() {//Wrapper class
		//AutoBoxing
		Boolean a = false;
		Character b = ' ';
		Byte c = 0;
		Short d = 0;
		Integer e =0;
		Long f =0L;
		Float g = 0.0F;
		Double h = 0.0;
	}
	
	public void me1() {
		boolean a = false;
		char b =' ';
		byte c = 0;
		short d = 0;
		int e = 0;
		long f = 0L;
		float g =0.0F;
		double h = 0.0;
	}

}
