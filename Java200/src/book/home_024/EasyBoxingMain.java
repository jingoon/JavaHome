package book.home_024;

public class EasyBoxingMain {
	public static void main(String[] args) {
		
		int intNum1=123;
		long longNum1=345L;
		double doubleNum=123.123;
	
		Integer intWrapper1 = new Integer(187);
		Long longWrapper1 = new Long(876);
		Double doubleWrapper1 = new Double(365);
		
		Object obj = new Object();			//predefined
		
		Integer intWrapper2 = intNum1;		//�ڽ�
		intNum1= intWrapper1;				//��ڽ� intNum1=(int)int Wrapper2;
		
		obj=longWrapper1;					//��� ����(����) ���θ��
		longWrapper1=(Long) obj;			//��� ����(����) ĳ����
		obj=intNum1;						//�ڽ� --> obj=new new Integer (intNum1);
		intNum1=(Integer)obj;				//��ڽ� --> ((integer)obj).intValue();
		System.out.println(intNum1);
	
	}

}
