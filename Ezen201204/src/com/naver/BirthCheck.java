package com.naver;

import java.util.Calendar;

public class BirthCheck {
		
	public boolean birthCheck(String member_birth) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		boolean isok=false;
		String[] birthArr=member_birth.split("-");
		String sc_year = birthArr[0];
		int sc_yearInt=Integer.valueOf(sc_year);
		String sc_month = birthArr[1];
		int sc_monthInt=Integer.valueOf(sc_month);
		String sc_date = birthArr[2];
		int sc_dateInt = Integer.valueOf(sc_date);
	
		// �⵵
		int cal_year=cal.get(Calendar.YEAR);
		if(sc_yearInt<1800 || sc_yearInt>cal_year) {
			return isok;
		}
		// ��
		if(sc_monthInt<0 || sc_monthInt>12) {
			return isok;
		}
		// ��
		cal2.set(Calendar.YEAR,sc_yearInt);
		cal2.set(Calendar.MONTH, sc_monthInt-1);
		int cal2_lastDate = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
		if(sc_dateInt<0 || sc_dateInt >cal2_lastDate) {
			System.out.println("�ش���� ������ ���� "+cal2_lastDate+"�� �Դϴ�.");
			return isok;
		}
		return true;
	}
	

}
