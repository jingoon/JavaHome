package InputOutputExmple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class InputOutputEx {
	
	public void dtoStream() {
		MemberDTO dto = new MemberDTO("moo1", "kim", 20);
		
		OutputStream out = null;
		ObjectOutputStream oos=null;
		
		InputStream in =null;
		ObjectInputStream ois = null;
		
		try {
			out = new FileOutputStream("obj.txt");
			oos = new ObjectOutputStream(out);
			oos.writeObject(dto);
			
			in = new FileInputStream("obj.txt");
			ois = new ObjectInputStream(in);
			Object obj = ois.readObject();
			
			if(obj.getClass()==dto.getClass()) {
				MemberDTO dto2 = (MemberDTO) obj;
				System.out.println(dto2.getId());
				System.out.println(dto2.getName());
				System.out.println(dto2.getAge());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (ois != null) {
					ois.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
