package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Insert implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("mid�� �Է��ϼ���");
		String mid = sc.nextLine();
		System.out.println("name�� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("job�� �Է��ϼ���");
		String job = sc.nextLine();
		
		System.out.println("��������� �Է��մϴ�");
		System.out.println("��� �⵵(4�ڸ�)�� �Է� �ϼ���");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������� �Է� �ϼ���");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("����ϸ� �Է� �ϼ���");
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
