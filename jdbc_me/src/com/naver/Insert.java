package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Scanner;

public class Insert implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("mid를 입력하세요");
		String mid = sc.nextLine();
		System.out.println("name을 입력하세요");
		String name = sc.nextLine();
		System.out.println("job을 입력하세요");
		String job = sc.nextLine();
		System.out.println("birth는 지금 날짜로");
	//	String birth = sc.nextLine();
		Date birth = new Date(Calendar.getInstance().getTimeInMillis());

		MemberDTO odto = SelectBymid.selectBymid(mid);
		if (odto != null) {
			System.out.println("중복 id로 입력 실패");
			return;
		}
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "insert into member values (?,?,?,?)";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1,mid);
			pst.setString(2, name);
			pst.setString(3, job);
			pst.setDate(4, birth);
									
			pst.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pst != null) {
					pst.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "1.insert";
	}
	


	

}
