package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Insert implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("mid를 입력하세요");
		String mid = sc.nextLine();
		System.out.println("name을 입력하세요");
		String name = sc.nextLine();
		System.out.println("job을 입력하세요");
		String job = sc.nextLine();
		
		System.out.println("생년월일을 입력합니다");
		System.out.println("출생 년도(4자리)를 입력 하세요");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출생월를 입력 하세요");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("출생일를 입력 하세요");
		int date = sc.nextInt();
		sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis()); 
		
		MemberDAO dao = new MemberDAO();
		dao.insert(mid, name, job, birth);
		
	}	
	@Override
	public String toString() {
		return "1.insert";
	}
	


	

}
