package book.home_024;

import book.home_021.Student;

public class AssignMain {

	public static void main(String[] args) {
		
		int intNum1 = 123;
		long longNum1=345L;
		double doubleNum=123.123;
		
		Integer intWrap1 = new Integer(187);
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		String str="Hello JAVA";				//predefined
		String newStr= new String("Hello");		//predefined
		Object obj = new Object();				//predefined
		
		Student stu = new Student();			//����� ����
		
		doubleNum = longNum1;					//primitive ���θ��
		intNum1 =(int)doubleNum;				//primitive ĳ����
		longNum1 = longWrap1.longValue();		//pri <-->wrap
		
		//longWrap1=intWrap1;					//reference type mismatch
		obj=longWrap1;							//��� ����(����) ���θ��
		longWrap1=(long)obj;					//��� ����(����) ĳ����
		System.out.println(longWrap1.longValue());
		
		obj=stu;								//��� ����(����) ���θ��
		stu=(Student)obj;						//��� ����(����) ĳ����
		System.out.println(stu.getName());
		// str=stu;								//reference type mismatch
	}
}
