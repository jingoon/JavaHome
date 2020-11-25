package JDBCExmple;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import JDBCMainExmple.MemberDAO;
import JDBCMainExmple.MemberDTO;

public class MainEx {
	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		//�Է�
		dao.insert(new MemberDTO("m003", "nam", "b", new Date(Calendar.getInstance().getTimeInMillis())));
		//��ȸ
		MemberDTO odto =dao.selectByid("m003");	
		//����
		dao.update(new MemberDTO("m003", "kim", odto.getJob(), odto.getBirth()));
		//���� ��ȸ
		List<MemberDTO> list= dao.select();
		dao.listPrint(list);
		//����
		dao.delete(odto);
	}

}
