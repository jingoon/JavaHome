package com.naver;

import java.sql.Connection;
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
			System.out.println("연결실패");
		}
	}
	
	// delete 추가해 주세요.
	// insert 추가해 주세요.
	// select 추가해 주세요.
	
	public void insert(MemberDTO dto) {
		
	}
	
	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		return list;
	}
	
	public void delete() {
		
	}
	
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		String sql="update member set member_id=?, member_pw=?, member_name=?, member_birth=? where member_num=?";
		
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMember_id());
			pstmt.setString(2, dto.getMember_pw());
			pstmt.setString(3, dto.getMember_name());
			pstmt.setString(4, dto.getMember_birth());
			pstmt.setInt(5, dto.getMember_num());
			pstmt.executeUpdate();
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pstmt, conn);
		}
	}	
	
	public List<MemberDTO> selectByNmae(String member_name) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from member where member_name=?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_name);
			
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int member_num=rs.getInt("member_num");
				String member_id=rs.getString("member_id");
				String member_pw=rs.getString("member_pw");
				String member_birth=rs.getString("member_birth");
				
				dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		if(dto==null) {
			return null;
		}else {
			return list;
		}
		
	}

	
	public MemberDTO selectByid(String member_id) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from member where member_id=?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			rs=pstmt.executeQuery();
			if (rs.next()) {
				int member_num=rs.getInt("member_num");
				String member_pw=rs.getString("member_pw");
				String member_name=rs.getString("member_name");
				String member_birth=rs.getString("member_birth");
				
				dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		return dto;
	}
	
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
		try {
			if (rs !=null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
