package JDBCExmple;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import JDBCMainExmple.MemberDAO;
import JDBCMainExmple.MemberDTO;

public class MainEx {
	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		//입력
		dao.insert(new MemberDTO("m003", "nam", "b", new Date(Calendar.getInstance().getTimeInMillis())));
		//조회
		MemberDTO odto =dao.selectByid("m003");	
		//수정
		dao.update(new MemberDTO("m003", "kim", odto.getJob(), odto.getBirth()));
		//전부 조회
		List<MemberDTO> list= dao.select();
		dao.listPrint(list);
		//삭제
		dao.delete(odto);
	}

}
