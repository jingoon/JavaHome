package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test dao = new Test();
//		
		dao.me1();
		
		MemberDAO dao2 = new MemberDAO();
		
//		MemberDTO dto = new MemberDTO("m006", "jin", "a", 
//				new Date(Calendar.getInstance().getTimeInMillis()));
//		
//		
//		dao2.insert(dto);
		
//		dao2.delete(new MemberDTO("m006", null, null, null));

	}

}
