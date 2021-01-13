package book.home_006;

import java.sql.Date;
import java.util.Calendar;

/**
 * Created on 2020.10.31<br>
 * calendar Ŭ������ �̿��� ��¥ ���ϱ�<br>
 * java.util.Date�� �̿��� �Ϸ� ���� �Ϸ� �ڸ� ����<br>
 * @author park'c
*/


public class CalendarAfAndBf {
	/**
	 * @param d �Է� ���� ���� ����ϱ� ���� �Է� ��
	 * @return �Ϸ� �ڸ� ���
	 */
	public Date afterOneDay(Date d) {
		// d ���� ��¥�� �Է��Ѵ�.
		long dd=d.getTime();
		//�и� ������*60��*60��*24�ð�==�Ϸ�
		return new Date(dd+1000*60*24);
	}
	/**
	 * @param d �Է� �� ���� ����ϱ� ���� �Է� ��
	 * @return �Ϸ� ������ ���
	 */
	public Date beforOneDay(Date d) {
		// d ���� ��¥�� �Է��Ѵ�.
		long dd= d.getTime();
		//�и� ������*60��*60��*24�ð�==�Ϸ�
		return new Date(dd-1000*60*60*24);
	}
	/*
	public Date setDate(int year, int month, int day){
	Calendar cal=Calendar.getInstance();
	cal.set(year, month-1, day);//0~11���� �����ϱ� ������ -1
	return new Date(cal.getTimeInMillis());
	}
	*/
}
