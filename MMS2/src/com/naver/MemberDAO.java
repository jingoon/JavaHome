package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	private void closeAll(ResultSet rs, 
						  PreparedStatement pstmt, 
			              Connection conn) {
		
		try {
			if (rs != null) {
				rs.close();
			}
			
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
	
	
	
	public void delete(MemberDTO dto) {
		//transaction이 필요 없는 상황인데,
		// 오늘 트랜잭션을 배워서 그냥 연습 삼아 구현해봤음.
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE mid = ?";
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
			pstmt.executeUpdate();
			
			isOk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			closeAll(null, pstmt, conn);
		}
	}
	
	
	public void update(MemberDTO dto) {
		//transaction이 필요 없는 상황인데,
		// 오늘 트랜잭션을 배워서 그냥 연습 삼아 구현해봤음.
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE member SET name = ? WHERE mid = ?";
		boolean isOK = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMid());
			
			pstmt.executeUpdate();
			
			isOK = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isOK) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			closeAll(null, pstmt, conn);
			
		}
	}
	
	
	
	public List<MemberDTO> select(){
		//transaction이 필요 없는 상황인데,
		// 오늘 트랜잭션을 배워서 그냥 연습 삼아 구현해봤음.
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT mid, name 이름, job 직업, birth 생일 FROM member";
		ResultSet rs = null;
		
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("이름");
				String job = rs.getString("직업");
				Date birth = rs.getDate("생일");
				
				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
			}
			
			isOk = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
			closeAll(rs, pstmt, conn);
		}

		return list;
	}
	
	
	
	
	
	
	public void insert(MemberDTO dto) {
		//transaction이 필요 없는 상황인데,
		// 오늘 트랜잭션을 배워서 그냥 연습 삼아 구현해봤음.
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member (mid, name, job, birth) VALUES (?,?,?,?)";
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			
			pstmt.executeUpdate();
			
			isOk = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			closeAll(null, pstmt, conn);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
