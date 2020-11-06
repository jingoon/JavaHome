package StringApi;

import java.util.StringTokenizer;

public class Test {

	public void me5() {
		String msg = "hello wolrd";
		System.out.println(msg.length());
	}

	// hello 한자씩 출력
	public void me6() {
		String msg = "hello";
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}

	// 문자열 유무 확인
	public void me7() {
		String msg = "hell world";
		System.out.println(msg.contains("zk"));

		int result = msg.indexOf("oo");
		System.out.println(result);

		System.out.println(msg.lastIndexOf("l"));

		int idx = msg.indexOf("l"); // 1번째
		System.out.println(idx);
		idx = msg.indexOf("l", idx + 1); // 2번째
		System.out.println(idx);
		idx = msg.indexOf("l", idx + 1);
		System.out.println(idx);

	}

	public void me8() {
		String msg = "asdf.avi";

		boolean result = msg.endsWith("avi");
		boolean result1 = msg.startsWith("a");
		System.out.println(result);
		System.out.println(result1);
	}

	public void me9() {

		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";

		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equalsIgnoreCase(msg3));
	}

	public void me10() {
		String msg = "       he    llo     ";

		System.out.println(msg.trim());
		System.out.println(msg);
		msg = msg.trim();
		System.out.println(msg);
	}

	public void me11() {
		String msg = " hello world";
		msg = msg.substring(msg.indexOf("w"), msg.length());
		System.out.println(msg);
	}

	public void me12() {
		String msg ="park#0000#vvip#50000##I#";
		StringTokenizer st =new StringTokenizer(msg,"#");
		String[] arr = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i++]=st.nextToken();
		}
		for(int j=0; j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
	
	public void me13() {
		String msg1 ="hello";
		String	msg2 ="Hello";
		String	msg3 = "HELLO";
		
		System.out.println(msg1.toUpperCase());
		msg2=msg2.toLowerCase();
		System.out.println(msg2);
		msg3=msg3.toLowerCase();
		System.out.println(msg3);
	}
	
	public void me14() {
		String msg = "오늘은 2020년 %02d월 %02d일";
		System.out.println(String.format(msg, 3, 3));
		
		String msg1="%0,7d원 입니다. 김밥 %,d원, 라면 %,d원 합이 %,d원";
		System.out.println(String.format(msg1, 10000, 3000, 4000, 3000+4000));
		
		String msg2="당신의 비만률은 %6.2f%%입니다"; 
		System.out.println(String.format(msg2, 1.633));
		System.out.println(String.format(msg2, 52.669));
		
				
	}

}
