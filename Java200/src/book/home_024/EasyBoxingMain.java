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
		
		Integer intWrapper2 = intNum1;		//¹Ú½Ì
		intNum1= intWrapper1;				//¾ð¹Ú½Ì intNum1=(int)int Wrapper2;
		
		obj=longWrapper1;					//»ó¼Ó °ü°è(°èÃþ) ÇÁ·Î¸ð¼Ç
		longWrapper1=(Long) obj;			//»ó¼Ó °ü°è(°èÃþ) Ä³½ºÆÃ
		obj=intNum1;						//¹Ú½Ì --> obj=new new Integer (intNum1);
		intNum1=(Integer)obj;				//¾ð¹Ú½Ì --> ((integer)obj).intValue();
		System.out.println(intNum1);
	
	}

}
