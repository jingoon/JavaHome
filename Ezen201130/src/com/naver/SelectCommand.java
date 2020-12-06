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
			for (int i = 0; i < list.size(); i++) {
				dto= list.get(i);
				printDto(dto);
			}
			break;
		case 2:
			//회원번호조회
			System.out.println("회원번호를 입력하세요");
			int member_num=sc.nextInt();
			sc.nextLine();
			dto=dao.selectByNum(member_num);
			
			try {
				printDto(dto);
			} catch (Exception e) {
				System.out.println("존재하지 않는 회원번호입니다");
			}
			break;
		case 3:
			//id조회
			System.out.println("회원아이디를 입력하세요");
			String member_id=sc.nextLine();
			dto=dao.selectByid(member_id);
			if(dto==null) {
				System.out.println("존재하지 않는 회원아이디입니다");
				break;
			}
			printDto(dto);
			break;
		case 4:
			//이름조회
			System.out.println("회원이름을 입력하세요");
			String member_name=sc.nextLine();
			list=dao.selectByName(member_name);
			if(list==null) {
				System.out.println("존재하지 않는 회원입니다");
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				dto= list.get(i);
				printDto(dto);
			}
			break;
		default:
			System.out.println("회원의 나이를 입력하세요");
		
			int member_age= sc.nextInt();
			sc.nextLine();
			list=dao.selectBybirth(member_age);
			if(list==null) {
				System.out.println("존재하지 않는 회원입니다");
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				dto= list.get(i);
				printDto(dto);
			}
		}
	}
	public void printDto(MemberDTO dto) {
		int num= dto.getMember_num();
		String id=dto.getMember_id();
		String name=dto.getMember_name();
		String birth=dto.getMember_birth();
		String email=dto.getMember_email();
		System.out.println("회원번호:"+num+" ID:"+id+" 이름:"+name+" 생년월일:"+birth+" email:"+email);
		
	}
	
	@Override
	public String toString() {
		return "2.조회 ";
	}
	
	
}
