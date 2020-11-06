package book.home_006;

import java.sql.Date;

public class CalendarAfAndBfEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalendarAfAndBf ti = new CalendarAfAndBf();
		Date ti1 = ti.afterOneDay(new Date(1000*60*60*24));
		System.out.println(ti1);
		
	}

}
