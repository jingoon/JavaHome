package book.home_009;

public class DataTypes {

	public static void main(String[] args) {
		// �⺻ Ÿ��
		int privateInt = 19;
		double privateLong = 3.1415;
		// ���� Ÿ��
		String refStr = "�ȳ��ϼ���";
		Object refObj = new Object();
		
		// ���� Ŭ����(����)
		// Integer wrapInt = new Integer(19); �����ߴ�
		// Double wrapDouble = new Double(3.14159) �����ߴ�
		
		// �迭(����)
		int a[] = {1,2,3};
		System.out.println("1: "+privateInt);
		System.out.println("2: "+privateLong);
		System.out.println("3: "+refStr);
		System.out.println("4: "+refStr.indexOf('��'));
		System.out.println("5: "+refStr.hashCode());
		System.out.println("6: "+refObj);
		System.out.println("7: "+refObj.getClass());
		System.out.println("8: "+refObj.hashCode());
		System.out.println("13: "+a);
		System.out.println("14: "+a.length);
		System.out.println("15: "+a[1]);
		
	}

}
