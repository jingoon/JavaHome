package com.naver;

import java.util.Scanner;

public class SelectBymid implements Command{
	
	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("id�� �Է��ϼ���");
		String mid =sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto= dao.selectBymid(mid);
		
		if(dto==null) {
			System.out.println("�������� �ʴ� mid�Դϴ�.");
		}
		System.out.println(dto);
		
	}

	@Override
	public String toString() {
		return "2.SelectBymid";
	}
	

}
