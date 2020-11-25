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
	private final String USER = "ezen";
	private final String PASSWORD = "ezen";
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
			System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
		}
	}
	
	public void insert(String mid, String name, String job, Date birth) {
		MemberDTO odto =selectBymid(mid);
		if(odto!=null) {
			System.out.println("�ߺ� id�� �Է� ����");
			return;
		}
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "insert into member values (?,?,?,?)";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getMid());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getJob());
			pst.setDate(4, dto.getBirth());
									
			int exe=pst.executeUpdate();
			if(exe==0) {
				System.out.println("�Է� ����");
			}else {
				System.out.println("�Է� ����");
			}
			
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

	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn=null;
		PreparedStatement pst =null;
		String sql ="select * from member";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
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
			System.out.println("list ���� ����");
			
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
		
		return list;
	}
	public void delete(String mid) {
		MemberDTO odto=selectBymid(mid);
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "delete from member where mid =?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, odto.getMid());
			int exe =pst.executeUpdate();
			if(exe==0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
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
	
	public MemberDTO selectBymid(String mid) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "select * from member where mid=?";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
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
	
	public void update(String mid, String name) {// ���� �� ���� . ������ ���� ������ �״�� �߰� �������̵�
		MemberDTO odto= selectBymid(mid);
		Connection conn = null;
		PreparedStatement pst = null;
		String sql ="update member set name=?, job=?, birth=? where mid=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, odto.getJob());
			pst.setDate(3, odto.getBirth());
			pst.setString(4, mid);
			int exe =pst.executeUpdate();
			if(exe==0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
