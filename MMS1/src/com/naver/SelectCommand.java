package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command {
	@Override
	public void execute(Scanner sc) {

		for(int i=0;i<DB.db.size();i++) {
			MemberDTO dto = DB.db.get(i);
			System.out.println(dto);
		}

	}
}
