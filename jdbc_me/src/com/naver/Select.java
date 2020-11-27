package com.naver;

import java.util.List;
import java.util.Scanner;

public class Select implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list= dao.select();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	@Override
	public String toString() {
		return "3.Select";
	}

}
