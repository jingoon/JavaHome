package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command{
	
	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		//회원번호조회
		//id조회
		String member_id=sc.nextLine();
		dao.selectByid(member_id);
		//이름조회
		String member_name=sc.nextLine();
		dao.selectByNmae(member_name);
		//생일조회
		//가입일조회(내림차순,오름차순)
		//가입기간조회(몇년 몇월 ~ 몇년 몇월)
	}
	@Override
	public String toString() {
		return "2.조회 ";
	}
	
	
}
