package com.naver;

import java.util.List;
import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		System.out.println("1.아이디로 삭제, 2.회원번호로 삭제, 3.이름으로 삭제");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("아이디를 입력해주세요");
			String member_id = sc.nextLine();
			dto=dao.selectByEquelId(member_id);
			if(dto==null) {
				System.out.println("삭제 실패: 일치하는 아이디가 없습니다");
			}else {
				dao.delete(dto);
				System.out.println(member_id+"가 삭제되었습니다.");
			}
			break;

		case 2:
			System.out.println("회원번호를 입력해주세요");
			int member_num = sc.nextInt();
			sc.nextLine();
			dto=dao.selectByNum(member_num);
			if(dto==null){
				System.out.println("삭제 실패: 일치하는 회원번호가 없습니다");
			}else {
				dao.delete(dto);
				System.out.println(member_num+"이 삭제되었습니다.");
			}
			break;
		case 3:
			System.out.println("이름을 입력해주세요");
			String member_name=sc.nextLine();
			List<MemberDTO>list=dao.selectByName(member_name);
			if(list.size()==0) {
				System.out.println("없는 회원입니다");
			}else if(list.size()==1) {
				dto=list.get(0);
				dao.delete(dto);
				System.out.println("회원"+member_name+"가 삭제되었습니다.");
			}else {
				System.out.println(list.size() + "명의 중복된 회원이 존재합니다.");
				System.out.println("모두 삭제 하시겠습니까?(Y, N)");
				String y = sc.nextLine();
				if (y.equalsIgnoreCase("y")) {
					for (int i = 0; i < list.size(); i++) {
						dto = list.get(i);
						dao.delete(dto);
					}
					System.out.println("회원" + member_name + "가 " + list.size() + "명 삭제되었습니다.");
				} else {
					System.out.println("삭제가 취소 되었습니다.");
				} 
			}
			break;
				
		}

	}

	@Override
	public String toString() {
		return "삭제 ";
	}
	
}
