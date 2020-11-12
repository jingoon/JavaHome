package CalendarExmple;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx {

	public void me1() {
		Calendar c = Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		int day=c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(date);
		System.out.println(day);
		System.out.println(String.format("%1$tY %1$tm %1$td %1$tD %1$tF", c));
		System.out.printf("6:Today %1$tm %1$te,%1$tY %n",c);
		System.out.printf("7:Today %1$tm %1$td,%1$ty %n",c);
		System.out.printf("8:Today %1$th %1$td일 %1$tI시,%1$ta %n",c);
		System.out.printf("%1$tY %1$ta %2$d     %n%n",c,8); //1$ 첫번째 인수 대입
	}
	
	public void me2() {
		Calendar c = Calendar.getInstance();
		c.set(1950, Calendar.JUNE,25);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
	public void me3() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.YEAR, 1950);
		int maxDate =c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DATE, maxDate);
		
		int day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(maxDate);
		String[] days = {"일","월","화","수","목","금","토"};
		int i=0;
		while (i<=days.length) {
			if (day-1==i) {
				System.out.println(days[i]);
			}
			i++;
		}
	
	}
	public void me4() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 10, 12);
		c.add(Calendar.DATE, 20);
		System.out.println(c.getTime());
		Calendar c2 = Calendar.getInstance();
		c2.clone();
		c2.add(Calendar.DATE, 20);
		System.out.println(c2.getTime());
		
	}
	public void me5() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.roll(Calendar.DATE, 20);			//c.set과의 차이가 뭔가?
		System.out.println(c.getTime());
	}
	public void me6() {
		Calendar c= Calendar.getInstance();
		c.getTime();
		
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
		
	}
	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		SimpleDateFormat a = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String msg = a.format(c.getTime());
		System.out.println(msg);
		
		
	}
	
	
	
}
