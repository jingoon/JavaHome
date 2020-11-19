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
			out.write("kim");	//하나씩 입력 가능
			out.write(System.getProperty("line.separator")); //줄바꿈
			
			for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i));
				out.write(System.getProperty("line.separator"));
			}
			System.out.println("hello.txt 쓰기완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();// 스트림에 남아있는 데이터를 모두 넘기고 닫는다
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
