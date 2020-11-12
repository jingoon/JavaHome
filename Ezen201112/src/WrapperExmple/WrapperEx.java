package WrapperExmple;

public class WrapperEx {
	
	public void me1() {
		
		boolean a= false;
		char b = 0;
		byte c=0;
		short d=0;
		int e=0;
		long f=0L;
		float g=0.0f;
		double h=0.0;
	}
	
	public void me2() {
		
		Boolean a= false;
		Character b = 0;
		Byte c=0;
		Short d=0;
		Integer e=0;
		Long f=0L;
		Float g=0.0f;
		Double h=0.0;
	}
	
	public void me3() {
		
		boolean a = new Boolean(false);
		Character b = new Character('c');
		char bb=b;
		
	}
	public void me4() {
		String msg1 = "1234567";
		String a = "h";
		int i1 = Integer.parseInt(msg1);
		int i2 = Integer.valueOf(msg1);
		char a2 =a.charAt(0);
		
		
	}

}
