package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("이름 수정을 시작합니다");
		System.out.println("아이디를 입력하세요");
		String mid=sc.nextLine();
		
		System.out.println("새 이름을 입력하세요.");
		String name = sc.nextLine();
		MemberDTO dto = new MemberDTO(mid, name, null, null);
		MemberDAO dao = new MemberDAO();

		dao.update(dto);
	}

}
