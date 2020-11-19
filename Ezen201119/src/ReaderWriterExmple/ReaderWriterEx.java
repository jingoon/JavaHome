package ReaderWriterExmple;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriterEx {
	
	public void w1() {
		Writer out = null;
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("JAVA");
		
		try {
			out = new FileWriter("c:"+File.separator+"hello.txt");
			out.write("kim");	//�ϳ��� �Է� ����
			out.write(System.getProperty("line.separator")); //�ٹٲ�
			
			for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i));
				out.write(System.getProperty("line.separator"));
			}
			System.out.println("hello.txt ����Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();// ��Ʈ���� �����ִ� �����͸� ��� �ѱ�� �ݴ´�
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
