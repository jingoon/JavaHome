package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	
	public MemberDAO() {
		try {
			Class.forName(Command.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String mid, String name, String job, Date birth) {
		MemberDTO odto =selectBymid(mid);
		if(odto!=null) {
			System.out.println("중복 id로 입력 실패");
			return;
		}
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		Connection conn= null;
		PreparedStatement pst = null;
		String sql = "insert into member values (?,?,?,?)";
		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER,Command.PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getMid());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getJob());
			pst.setDate(4, dto.getBirth());
									
			int exe=pst.executeUpdate();
			if(exe==0) {
				System.out.println("입력 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pst, conn);
		}
	}

	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn=null;
		PreparedStatement pst =null;
		String sql ="select * from member";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);
			pst = conn.prepareStatement(sql);
			
			rs=pst.executeQuery();
			while(rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("name");
				String job =rs.getString("job");
				Date birth = rs.getDate("birth");
				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
				
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pst, conn);
		}
		
		return list;
	}
	public void delete(String mid) {
		MemberDTO odto=selectBymid(mid);
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "delete from member where mid =?";
		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, odto.getMid());
			int exe =pst.executeUpdate();
			if(exe==0) {
				System.out.println("삭제 실패");
			}else {
				System.out.println("삭제 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pst, conn);
		}
	}
	
	public MemberDTO selectBymid(String mid) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "select * from member where mid=?";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);
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
			closeAll(rs, pst, conn);
		}
		
		
		return dto;
	}
	
	public void update(String mid, String name, String job, Date birth) {
		Connection conn = null;
		PreparedStatement pst = null;
		String sql ="update member set name=?, job=?, birth=? where mid=?";
		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, job);
			pst.setDate(3, birth);
			pst.setString(4, mid);
			int exe =pst.executeUpdate();
			if(exe==0) {
				System.out.println("수정 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pst, conn);
			
		}
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pst, Connection conn ) {
		
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
