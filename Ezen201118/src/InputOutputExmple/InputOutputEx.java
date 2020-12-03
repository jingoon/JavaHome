package InputOutputExmple;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputEx {
	//1-1.����(�̹���)���� 
		public void me1() {
			InputStream in = null;		//1
			OutputStream out = null;		
			try {				//2
				in = new FileInputStream("c:"+File.separator+"test.jpg");		//6
				out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");

				int what=-1;						//7
				while((what=in.read()) !=-1) {
					out.write(what);
				}
				System.out.println("end");
				
			} catch (Exception e) {
				e.printStackTrace();		//5
			}finally {				//2.1
				try {			//3
					if (in !=null) {	//4
						in.close();	
					}
					if (out !=null) {
						out.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();//4.1
				}
			}
		}
	//1-2. �迭�� �̿��Ͽ� ���Ͻ�Ʈ���� �ӵ� ���
	//- �����̷� �Űܼ� �ӵ��� �ø���
		public void me2() {
			InputStream in= null;
			OutputStream out = null;
			try {
				
				in = new FileInputStream("c:"+File.separator+"test.jpg");
				out = new FileOutputStream("c:"+File.separator+"test_copy2.jpg");
				
				
				byte[] arr = new byte[1024]; //what���, �迭�� �� ���� �迭�� 2�� ����� ����, �� ������
				int length=-1;
				while((length = in.read(arr)) !=-1) {// ���̻� ���� ���� ������ read�� -1�� ��ȯ �Ѵ�, length���� �ȴ�
					
					out.write(arr,0,length);	//�迭�� ����Ѵ� ù �ε������� ���� length����
				}
				System.out.println("copy end");
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (in != null) {
						in.close();
					}
					if (out !=null) {
						out.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	//bufferedStream
	//2-1. ���Ͻ�Ʈ������ ���� �����͸� ���ۿ��� �Ѱ���� ��Ƽ� �����Ѵ� (�ӵ� ���)

	public void me3() {
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);	// ���� ä�̴�
			out = new FileOutputStream("c:"+File.separator+"test_copy3.jpg");
			bos = new BufferedOutputStream(out);
			int what =-1;
			while((what = bis.read()) != -1) {
				bos.write(what);
			}
			System.out.println("endd");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis!=null) {	//���͸� ���� �ݴ´�
					bis.close();
				}
				if (bos!=null) {	//���͸� ���� �ݴ´�
					bos.close();
				}
				if (in !=null) {
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

	//2-2. �迭�� ���ۿ� �����Ͽ� �ӵ� ���� ���
		public void me4() {
			InputStream in = null;
			BufferedInputStream bis = null;
			OutputStream out = null;
			BufferedOutputStream bos = null;
			try {
				in = new FileInputStream("c:"+File.separator+"test.jpg");			
				bis = new BufferedInputStream(in);
				out = new FileOutputStream("c:"+File.separator+"test_copy4.jpg");
				bos = new BufferedOutputStream(out);
				byte[] arr = new byte[1024];
				int length = -1;
				while((length = bis.read(arr)) !=-1) {
					bos.write(arr, 0, length);
				}
				System.out.println("copyEnd");
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (bis !=null) {
						bis.close();
					}
					if (bos != null) {
						bos.close();
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
		
		public void me5() {
			
			InputStream in = null;
			OutputStream out = null;
			BufferedInputStream bis = null;
			BufferedOutputStream bos =null;
			
			try {
				
				in = new FileInputStream("c:"+File.separator+"test.jpg");
				bis = new BufferedInputStream(in);
				out = new FileOutputStream("."+File.separator+"src"+File.separator+"img"+File.separator+"test_copy.jpg");// �����
				bos = new BufferedOutputStream(out);
				
				byte[] arr = new byte[1024];
				int length = -1;
				while ((length=bis.read(arr)) != -1) {
					bos.write(arr, 0, length);
					
				}
				System.out.println("���� ��");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (bis != null) {
						bis.close();
					}
					if (bos !=null) {
						bos.close();
					}
					if (in !=null) {
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
