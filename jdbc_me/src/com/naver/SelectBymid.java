package com.naver;

import java.util.Scanner;

public class SelectBymid implements Command{
	
	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("id를 입력하세요");
		String mid =sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto= dao.selectBymid(mid);
		
		if(dto==null) {
			System.out.println("존재하지 않는 mid입니다.");
		}
		System.out.println(dto);
		
	}

	@Override
	public String toString() {
		return "2.SelectBymid";
	}
	

}
