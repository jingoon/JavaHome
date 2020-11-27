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
		System.out.println("������ id�� �Է��ϼ���");
		String mid=sc.nextLine();
		
		if(dao.selectBymid(mid)==null) {
			System.out.println("�������� �ʴ� mid �Դϴ�.");
			List<MemberDTO> list= dao.select();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			return;
		}

		System.out.println("���ο� name�� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���ο� job�� �Է��ϼ���");
		String job = sc.nextLine();
		
		System.out.println("����⵵�� �Է��ϼ���");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������� �Է��ϼ���");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("������� �Է��ϼ���");
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
