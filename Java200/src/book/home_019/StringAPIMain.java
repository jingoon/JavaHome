package book.home_019;

public class StringAPIMain {
	public static void main(String[] args) {
		String strApiTest ="hello! nice to meet you.";
		strApiTest += "\nThank you very much.";
		
		System.out.printf("1: %s%n",strApiTest);
		
		System.out.printf("2: %s%n",strApiTest.replace('o', 'z'));
		System.out.printf("3: %s%n",strApiTest);
		
		strApiTest=strApiTest.replace('o', 'h');
		System.out.printf("4: %s%n", strApiTest);
		
		strApiTest=strApiTest.substring(4);			//�ε��� 4(����)���� ������ �ڸ���
		System.out.printf("5: %s%n",strApiTest);
		
		strApiTest=strApiTest.toUpperCase();		//����ڷ�
		System.out.printf("6: %s%n",strApiTest);
		
	}

}
