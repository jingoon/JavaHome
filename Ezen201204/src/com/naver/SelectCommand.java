package com.naver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectCommand implements Command{
	
	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		List<MemberDTO>list = new ArrayList<MemberDTO>();
		System.out.println("1.전체조회, 2.회원번호조회, 3.아이디조회, 4.이름조회, 5.나이조회");
		int menu= sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			//전체조회
			list = dao.select();
			dao.print(list);
			break;
		case 2:
			//회원번호조회
			System.out.println("회원번호를 입력하세요");
			int member_num=sc.nextInt();
			sc.nextLine();
			dto=dao.selectByNum(member_num);
			if(dto==null) {
				System.out.println("일치하는 회원번호가 없습니다.");
			}else {
				dao.print(dto);
			}
			break;
		case 3:
			//id조회
			System.out.println("회원아이디를 입력하세요");
			String member_id=sc.nextLine();
			list=dao.selectByid(member_id);
			if(list.size()==0) {
				System.out.println("일치하는 아이디가 없습니다.");
			}else {
				dao.print(list);
			}
			break;
		case 4:
			//이름조회
			System.out.println("회원이름을 입력하세요");
			String member_name=sc.nextLine();
			list=dao.selectByName(member_name);
			if(list.size()==0) {
				System.out.println("일치하는 회원이 없습니다.");
			}else {
				dao.print(list);
			}
			break;
		case 5:
			System.out.println("회원의 나이를 입력하세요");
		
			int member_age= sc.nextInt();
			sc.nextLine();
			list=dao.selectBybirth(member_age);
			if(list.size()==0) {
				System.out.println("회원 중 "+member_age+"세 회원은 없습니다");
				break;
			}
			dao.print(list);
			break;
		}
	}
	
	@Override
	public String toString() {
		return "조회 ";
	}
	
	
}
