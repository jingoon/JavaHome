package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectBymid {
	private static Command com;
	
	public static MemberDTO selectBymid(String mid) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "select * from member where mid=?";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(com.URL, com.USER, com.PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, mid);
			
			rs=pst.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String job=rs.getString("job");
				Date birth =rs.getDate("birth");
				dto = new MemberDTO(mid, name, job, birth);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		
		
		return dto;
	}

}
