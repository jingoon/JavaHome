package book.home_029;

public class TriOperatorMain {
	
	public static void main(String[] args) {
		for(int year=1998;year<2020;year++) {
			boolean yearTF=((0==(year%4) && 0!=(year%100)) || (0==year%400)) ?true:false;
			
			if(yearTF) {
				System.out.println(year+"�� �����Դϴ�.");
				
			}else {
				System.out.println(year+"�� ������ �ƴմϴ�.");
			}
		}//for end
		
		//(���밪) 10������ 2������ �ٲٱ�
		String s="";
		int numS=-123;
		int numT=numS;
		int count=1;
		for(int i=0;i<=31;i++) {
			int aa=numS%2;
			s=(aa>=0) ? aa+s:(-aa)+s;	//���׿�����
			numS/=2;					//���밪�� 2���� �����
			
		}
		System.out.println(numT+"toBinary:"+s);
	
	}

}
