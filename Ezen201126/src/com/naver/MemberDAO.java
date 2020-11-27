package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MemberDAO {
	private final String DRIVER="oracle.jdbc.OracleDriver";
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER="home";
	private final String PASSWORD="home";
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
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
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(MemberDTO dto) { //t Ʈ������ ������� ������ �����غ�
		Connection conn =null;
		PreparedStatement pstmt=null;
		String sql = "delete from member where mid=?";
		boolean isok=false;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
			pstmt.executeUpdate();
			
			isok=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (isok) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeAll(null, pstmt, conn);
		}
		
	}
	
	
	public void update(MemberDTO dto) { //t Ʈ������ ������. ������
		Connection conn =null;
		PreparedStatement pstmt = null;
		String sql = "update member set name=? where mid=?";
		boolean isok=false;//t
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);//t
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMid());
			
			pstmt.executeUpdate();
			
			isok=true;//t
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {//t
				if (isok) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			closeAll(null, pstmt, conn);
		}
	}
	
	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		String sql = "select mid,name �̸�, job ����, birth ���� from member";
		ResultSet rs=null;
		boolean isok=false; //t Ʈ������ ����, �� �޼��忡�� ������
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false); //t ����commit�� ����
			pstmt=conn.prepareStatement(sql);
			
				
			rs=pstmt.executeQuery();
			while (rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("�̸�");
				String job = rs.getString("����");
				Date birth = rs.getDate("����");
				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
			}
			
//			if(pstmt !=null) {			//t pstmt�� �����ϱ� ���� �������� �ݾ��ش�.
//				pstmt.close();
//			}
//			pstmt=conn.prepareStatement(sql2);
			
			
			isok=true;//t ���� ������ ����
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (isok) {
					conn.commit();// �������� commit
				}else {
					conn.rollback();// ���������� rollback
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeAll(rs, pstmt, conn);
		}
		
		return list;
	}
	
	
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		String sql="insert into member values (?,?,?,?)";
		boolean isok=false; //t Ʈ������ó�� �н��� ���� �ۼ�
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);//t
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			pstmt.executeUpdate();
					
			
			isok=true;//t
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {//t ���߿��� �̰͵� �޼��� ó��
				if (isok) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeAll(null, pstmt, conn);	// �ߺ��Ǵ� close ��ɵ��� �޼��� ó��
		}
	}
	
	
	

}
