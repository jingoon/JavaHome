package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
	public void me1() {
		//byte stream���� �Է°� ���õ� �ֻ��� �θ�Ŭ������ InputStream
		//byte stream���� ��°� ���õ� �ֻ��� �θ�Ŭ������ OutputStream
		//InputStream, OutputStream �߻�Ŭ�����̴�
		//��ü ��������
		//I/O ��ü�� �ݵ�� �����ڰ� �޸𸮸� �������Ѿ� �Ѵ�
//		<I/O ��ü �����>
//		1. stream�� ���� �Ѵ�.
//		2. try ~catch ~finally ������ ����
//		3. ~f �ȿ� t~c
//		4. f �ȿ� �ִ� try�� close() ȣ��,(in�� out�� if) c�� ����ó��
//		5. �� try catch�� ����ó��
//		6. ���� try�� �ڵ� : ��ü����
		
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");
			
			
			//���� ó������ ������ �����͸� 1byte�� �о� �´�
			//�� ���� �ݺ����� ����ؾ� �ϴ��� �𸣱⿡ while���� ���
			while (true) {
			int	what = in.read();
				if(what == -1) {	// ���̻� �ٰ� ������ -1�� �Ѱ��ش�.
					break;
				}
				
				out.write(what);
			}
			System.out.println("file copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in !=null) {
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
	
	public void me2() {
		InputStream in = null;
		BufferedInputStream bis = null;
		
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			
			out = new FileOutputStream("c:"+File.separator+"test_copy2.jpg");
			bos = new BufferedOutputStream(out);
			
			int what=-1;
			while(true) {
				what = bis.read();
				if(what == -1) {
					break;
				}
				bos.write(what);
			}
			System.out.println("copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis!= null) {	//���� ���� close
					bis.close();
				}
				if (in != null) {	//��彺Ʈ���� ���ͺ��� ���߿� close
					in.close();
				}
				
				if (bos!= null) {
					bos.close();
				}
				
				if (out != null) {
					out.close();
				}
				
					
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me3() {
		InputStream in= null;
		OutputStream out = null;
		try {
			
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");
			
			
			byte[] arr = new byte[1024]; //what���, �迭�� �� ����
			int length=-1;
			while(true) {
				length = in.read(arr);
				if(length ==-1) {
					break;
				}
				out.write(arr,0,length);
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
	public void me4() {
		
		InputStream in =null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
				
		try {
			
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("c:"+File.separator+"test_copy2.jpg");
			bos = new BufferedOutputStream(out);
		
			byte[] arr = new byte[1024];
			int length= -1;
			while(true) {
				length = bis.read(arr);
				if(length == -1) {
					break;
				}
				bos.write(arr,0,length);
			}
			System.out.println("end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis != null) {
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
		byte[] arr = new byte[1024];
		
		
		
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			out = new FileOutputStream("."+File.separator+"src"+File.separator+"upload"+File.separator+"test_copy2.jpg");
			
			
			int length =-1;
			while(true) {
				length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
	public void me6() {
		
		//������Ʈ��ǲ�ƿ�ǲ ��Ʈ��
		MemberDTO dto = new MemberDTO("m001","kim",10);
		
		OutputStream out = null;
		ObjectOutputStream oos = null;
		
		InputStream in = null;
		ObjectInputStream ois = null;
		
		try {
			out = new FileOutputStream("obj.txt");
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(dto);
			System.out.println(":::::::::::");
			
			in = new FileInputStream("obj.txt");
			ois = new ObjectInputStream(in);
			Object obj = ois.readObject();
			
			if(obj instanceof MemberDTO) {
				MemberDTO mDTO =(MemberDTO) obj;
				System.out.println(mDTO.getId());
				System.out.println(mDTO.getAge());
				System.out.println(mDTO.getName());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (in != null) {
					in.close();
				}
				if (ois != null) {
					ois.close();
					
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
