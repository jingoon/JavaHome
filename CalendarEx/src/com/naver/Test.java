package com.naver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public void me8() {
		// 자바에서는 Calendar클래스를 쓰자.
		// 그러나 DB에서는 Calendar클래스보다는 Date 클래스를 많이 사용한다.
		// 따라서 반드시 두 타입을 변환할 수 있어야 한다.
		
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);;
		
		
		
	}
	
	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.roll(Calendar.DATE, 20);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		
		
		
	}
	
	public void me6() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		// 2020년 11월 12일입니다.
		// 20일 후에는 며칠일까요?
		// 2020년 11월 32일....
		// 2020년 12월 2일.....
		//add()는 Calendar객체의 정보를 변경합니다.
		// 특정 필드의 값에 주어진 값을 더해서 변경합니다.
		c.add(Calendar.DATE, 20);
		System.out.println(c.getTime());
		
		
	}
	
	public void me5() {//안 중요한 예제...공부 안 해도 되는 예제
		Scanner sc = new Scanner(System.in);
		
		try {
			/*System.out.println("연도를 입력하세요.");
			int year = sc.nextInt();
			sc.nextLine();
			
			System.out.println("월을 입력하세요.");
			int month = sc.nextInt();
			sc.nextLine();*/
			
			int year = 2020;
			int month = 10;
			
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year+"년 "+month+"월");
			System.out.println(" SU MO TU WE TH FR SA");
			
			for(int i = 1; i < firstDateDay; i++) {
				System.out.print("   ");
			}
			
			for(int i=1; i< lastDate+1 ; i++) {
				String naljja = i<10? "  "+i: " "+i;
				System.out.print(naljja);
				if((i+firstDateDay-1) % Calendar.SATURDAY == 0) {
					System.out.println();
				}
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	public void me41() {
		//1950년 2월의 마지막날은 며칠까지 있을까요?
		//그리고 그날의 요일은 무엇일까요?
		//둘 다 각각 출력하시오.
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		c.set(Calendar.DATE, maxDate);
		
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
	
	public void me4() {
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
	}
	
	public void me32() {
		//1. 1950년 6월 25일은 무슨 요일일까요? 화면에 요일만 출력하시오.
		Calendar c = Calendar.getInstance();
		c.set(1950, Calendar.JUNE, 25);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		switch (day) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월용일");
			break;
		case 3:
			System.out.println("화용일");
			break;
		case 4:
			System.out.println("수용일");
			break;
		case 5:
			System.out.println("목용일");
			break;
		case 6:
			System.out.println("금용일");
			break;
		case 7:
			System.out.println("토용일");
			break;

		default:
			break;
		}
		
		
		
	}
	
	public void me31() {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(c);
	}
	
	
	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(1950, 6-1, 25);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
	}
	
	
	public void me2() {
		Calendar c = Calendar.getInstance();
		
		// c를 이용해서 연도 정보 추출하기.
		
		int year = c.get(Calendar.YEAR);
		// 월 정보 int month
		int month = c.get(Calendar.MONTH) + 1;
		// 일 정보 int date
		int date = c.get(Calendar.DATE);
		// 요일 정보 int day
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);		
	}
	
	
	public void me9() {
		//1. Calendar 클래스 객체 생성 방법
		Calendar c = Calendar.getInstance();
		
		
	}

}
