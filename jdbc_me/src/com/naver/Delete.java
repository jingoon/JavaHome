package com.naver;

import java.util.Scanner;

public class Delete implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 아이디를 입력하세요");
		String mid=sc.nextLine();
		MemberDAO dao = new MemberDAO();
		if(dao.selectBymid(mid)==null) {
			System.out.println("존제하지 않는 mid 입니다.");
			return;
		}
		dao.delete(mid);
	}

	@Override
	public String toString() {
		return "5.Delete";
	}
	

}
