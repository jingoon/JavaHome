package com.naver;

import java.util.Scanner;

public class InsertCommand_jin implements Command{

	private String member_id;
	private String member_name;
	private String member_pw;
	private String member_birth;
	private String member_email;
	private MemberDAO dao = new MemberDAO();
	private boolean ing=true;
	private int member_num;

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원입력을 시작합니다.");
		System.out.println();
		//id입력
		member_num=dao.maxNum()+1;
		while(ing) {
			System.out.printf("◆ ID를 입력하세요: ");
			member_id=sc.nextLine();
			ing=id(member_id);
		}
		//pw입력
		System.out.printf("◆ PASS WORD를 입력하세요: ");
		member_pw=sc.nextLine();
		//이름 입력
		System.out.printf("◆ 이름을 입력하세요: ");
		member_name=sc.nextLine();
		//생일 입력
		ing=true;
		while(ing) {
			System.out.printf("◆ 생년월일(예시:2020-12-03)을 입력하세요: ");
			member_birth=sc.nextLine();
			ing=!birth(member_birth);
			if(ing) {
				System.out.println("입력이 올바르지 않습니다");
			}
		}
		//email입력
		System.out.printf("◆ email을 입력하세요: ");
		member_email=sc.nextLine();
		//입력완료
		dao.insert(member_num, member_id, member_pw, member_name, member_birth, member_email);
		System.out.println("입력이 완료 되었습니다.");
	}
	// id 중복체크
	private boolean id(String member_id) {
		MemberDTO dto=dao.selectByEquelId(member_id);
		if(dto!=null) {
			System.out.println("사용할 수 없는 아이디 입니다");
			return true;
		}else {
			return false;
		}
	}
	// 생일 범위체크
	private boolean birth(String member_birth) {
		BirthCheck bc = new BirthCheck();
		return bc.birthCheck(member_birth);
	}

	@Override
	public String toString() {
		return "1.입력 ";
	}
	

}
