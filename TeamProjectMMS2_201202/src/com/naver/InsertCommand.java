package com.naver;


import java.util.Scanner;

public class InsertCommand implements Command{
	
	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		
		System.out.println("메뉴를 골라주세요");
		System.out.println("1.입력, 2.개인정보 제외한 입력 ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 1:
		System.out.println("회원가입을 환영합니다.");
		System.out.println("아이디를 입력해 주세요.");
		String member_id = sc.nextLine();
		System.out.println("비밀번호를 입력해 주세요.");
	    String member_pw= sc.nextLine();
		System.out.println("이름을 입력해 주세요.");
		String member_name = sc.nextLine();
		System.out.println("생년월일을 입력해주세요.");
		String member_birth = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String member_email = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(member_id, member_pw, member_name, member_birth, member_email);
		
		dao.insert(dto);
			
			break;

		case 2:
		System.out.println("회원가입을 환영합니다.");
		System.out.println("아이디를 입력해 주세요.");
		String member_id2 = sc.nextLine();
		System.out.println("비밀번호를 입력해 주세요.");
	    String member_pw2= sc.nextLine();
		System.out.println("이름을 입력해 주세요.");
		String member_name2 = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String member_email2 = sc.nextLine();
		MemberDTO dto2 = new MemberDTO(member_id2, member_pw2, member_name2, member_email2);
		dao.NoBirthInsertCommand(dto2);
	
			break;
		}
		
		
			
	}
	@Override
	public String toString() {
		return "1.입력, ";
	}
	
	
}
