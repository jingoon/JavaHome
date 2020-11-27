package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import kt.co.ezen.MainEx;

public class Update implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("수정할 id를 입력하세요");
		String mid=sc.nextLine();
		
		if(dao.selectBymid(mid)==null) {
			System.out.println("존재하지 않는 mid 입니다.");
			List<MemberDTO> list= dao.select();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			return;
		}

		System.out.println("새로운 name을 입력하세요");
		String name = sc.nextLine();
		System.out.println("새로운 job을 입력하세요");
		String job = sc.nextLine();
		
		System.out.println("출생년도를 입력하세요");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출생월을 입력하세요");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("출생일을 입력하세요");
		int date = sc.nextInt();
		sc.nextLine();

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		
		
		dao.update(mid, name, job, birth);
		
	}

	@Override
	public String toString() {
		return "4.Update";
	}

	
}
