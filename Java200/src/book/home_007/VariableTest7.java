package book.home_007;

public class VariableTest7 {
	public static void main(String[] args) {
		int a=10;	
		int b=20;
		int c=a+b;
		System.out.println("1-- �� 10+20="+c);
		int d=10;
		d=d+20;
		System.out.println("2-- �� 10+20="+d);
		String str="�ȳ��ϼ���!JAVA�� ���ô�.";
		System.out.println("3-- ���ڿ� ���:" +str);
		// String Concatenation
		System.out.println("--String Concatenation Test--");
		System.out.println(a+b+"��");
		System.out.println(a+"��"+b);
		System.out.println("��"+a+b);
		System.out.println("��"+(a+b));
	}

}
