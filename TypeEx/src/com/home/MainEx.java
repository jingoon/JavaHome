package com.home;

public class MainEx {
	public static void main(String[] args) {
		
		// ����, �⺻�ڷ����� �����ڷ���
		
		// �⺻�ڷ��� - ���ڷ���
		boolean boo = true;
		System.out.println(boo);
		boolean boo2 = false;	
		System.out.println(boo2);
			// �� �ڷ��� boolean�� ������ true�� false�� ���´�.
		
		// �⺻�ڷ��� - �����ڷ���
		byte by = -128;				 // 1byte=8bit, 2^8(256)�� ������ ���´�.
		System.out.println(by);
		
		short sh = -32768; 			 // 2byte, 2^16
		System.out.println(sh);
		
		int in = -2100000000;		 // 4byte, 2^32 ������ �⺻�ڷ���
		System.out.println(in);
		
		long lo = -2200000000L;		 // 8byte, 2^64, �� �ڿ� L/l�� ���´�
		System.out.println(lo);
		
		// �⺻�ڷ��� - �Ǽ��ڷ���
		float fl = 3.14f;			 // 4byte, �� �ڿ� F/f�� ���´�, double���� �������� ��������
		System.out.println(fl);
		
		double dol = 3.141592;		 // 8byte, �Ǽ��� �⺻�ڷ��� 
		System.out.println(dol);
		
		
	}

}
