package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class InsertCommand implements Command{
	
	

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원 가입 절차를 시작합니다.");
		
		System.out.println("아이디를 입력하세요.");
		String mid = sc.nextLine();
		
		System.out.println("성명을 읿력하세요.");
		String name = sc.nextLine();
		
		System.out.println("직업을 입력하세요.");
		String job = sc.nextLine();
		
		System.out.println("출생연도를 입력하세요.");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출생월을 입력하세요.");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("출생일을 입력하세요.");
		int date = sc.nextInt();
		sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
	}

	@Override
	public String toString() {
		return "등록";
	}
	
	
	
	
	

}
