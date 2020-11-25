package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE MID = ?";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMid());
			
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	public void update(MemberDTO dto) {
		
	}
	
	public List<MemberDTO> select(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		
		return list;		
	}
	
	public void insert(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql= "INSERT INTO member VALUES (?, ?, ?, ?)";
		
		try {
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			
			
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
