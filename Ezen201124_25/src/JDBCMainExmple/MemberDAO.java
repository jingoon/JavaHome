package JDBCMainExmple;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";	
	private final String USER = "home";
	private final String PASS = "home";

	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
		
	}
	
	public void insert(MemberDTO dto) {
		Connection conn =null;
		PreparedStatement pst = null;
		String sql = "insert into member values ( ? ,? ,? ,? )";
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getJob());
			pst.setDate(4, dto.getBirth());
			MemberDTO odto = selectByid(dto.getId());
			if(odto != null) {
				System.out.println("중복 id로 insert pass");
				return;
			}
			int exe=pst.executeUpdate();
			if(exe==0) {
				System.out.println("insert no");
			}else {
				System.out.println("insert ok");
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
		Connection conn =null;
		PreparedStatement pst = null;
		String sql = "select * from member";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			pst = conn.prepareStatement(sql);
			
			rs=pst.executeQuery();
			while(rs.next()) {
				String id=rs.getString("id");
				String name=rs.getString("name");
				String job=rs.getString("job");
				Date birth = rs.getDate("birth");
				MemberDTO dto = new MemberDTO(id, name, job, birth);
				list.add(dto);
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
		
		return list;
	}
	
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "Update member set name=?,job=?,birth=? where id=?"; // ? 순서대로index 1,2,3,4
		
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getJob());
			pstmt.setDate(3, dto.getBirth());
			pstmt.setString(4,	dto.getId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	
	public MemberDTO selectByid(String id) {
		MemberDTO dto = null;
		Connection conn =null;
		PreparedStatement pst = null;
		String sql = "select * from member where id=?";
		ResultSet rs=null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			
			rs=pst.executeQuery();
			if (rs.next()) {
				
				String name=rs.getString("name");
				String job=rs.getString("job");
				Date birth = rs.getDate("birth");
				dto = new MemberDTO(id, name, job, birth);
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
	
	public void delete(MemberDTO dto) {
		Connection conn =null;
		PreparedStatement pst = null;
		String sql = "delete from member where id=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getId());
			
			int exe=pst.executeUpdate();
			if(exe==0) {
				System.out.println("delete no");
			}else {
				System.out.println("delete ok");
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
	public void listPrint(List<MemberDTO> list) {
		
			for (int i = 0; i < list.size(); i++) {
				String id = list.get(i).getId();
				String name = list.get(i).getName();
				String job = list.get(i).getJob();
				Date birth = list.get(i).getBirth();
				java.util.Date bi = new java.util.Date(birth.getTime());
				
				System.out.printf("id:%s, 이름:%s, 직업:%s, 생일:%tF %n",id, name, job,bi);
			}
		}
		
}
