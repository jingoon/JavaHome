package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public void me1() {
		//����� �ϸ� ������ �������
		Writer out =null;
		
		String[] arr = {"hello", "world", "good"};
		
		try {
			out = new FileWriter("c:"+File.separator+"ss.txt"); // ���ϱ�����/ 
			
			out.write("kim");	//�ϳ��� �Է� ����
			out.write(System.getProperty("line.separator"));	// �ٹٲ� \r\n
			
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			//�Է°� ����� ���ÿ� ���� �� ������ 
			//close()�� �Է��� �Ʒ��� �ڵ��Ǿ� �־
			// ��½� ��Ʈ���� �����ִ� �����Ͱ� ���� �� �ִ�
			// �װ� �����ϱ� ���� out.flush() �� ���
			out.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();		// ��Ʈ���� �����ִ� �����͸� ��� �ѱ�� �ݴ´�
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("end");
	}
	
	public void me2() {
		
		Reader in = null;
		try {
			in = new FileReader("c:"+File.separator+"ss.txt");
					
			char[] arr = new char[1024];
			int length = -1;
			
			
			while(true){
				length=in.read(arr, 0, arr.length);
				if(length == -1) {
					break;
				}
				for (int i = 0; i <arr.length; i++) { // arr.length�� �̻��Ѱ��� �߰���
					System.out.print(arr[i]);
				}
			//	System.out.print((char)what);	//what�� �׳� ����ϸ� ���� ��µ�
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in !=null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void me3() {
		Reader in = null;
		Writer out = null;
		try {
			out = new FileWriter("c:"+File.separator+"abc.txt");
						
			out.write("1");
			out.write(System.getProperty("line.separator"));
			out.write("2");
			out.write(System.getProperty("line.separator"));
			out.write("3");
			out.write(System.getProperty("line.separator"));
			out.write("4");
			out.write(System.getProperty("line.separator"));
			out.write("�����");
			out.write(System.getProperty("line.separator"));
			out.write("5");
			out.write(System.getProperty("line.separator"));
			out.flush();		// ����� �����۾��� ���Ⱑ ������ �ۼ�
			
			in = new FileReader("c:"+File.separator+"abc.txt");
			
			int len = -1;
			char[] arr = new char[1024];
			while(true){
				len=in.read(arr,0,arr.length);
				if (len==-1) {
					break;
				}
				for (int i = 0; i < len; i++) {
					System.out.print(arr[i]);
				}
				
			}
			
			
			
			
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
	
	public void me4() {
		// inputstream - outstream
		//pair�� �����
		//�� �ȸ��ߴ� ������ ���� ���Ǵµ� , �ٸ����� ������
		//BufferedReader - BufferedWriter(������)
		//Scanner�� ����
		
		Reader in = null;
		BufferedReader br = null;
		try {
			in = new FileReader("c:"+File.separator+"abc.txt");
			br = new BufferedReader(in);
			
			String line=null;
			
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				
				System.out.println(line);
			}
			String a= "100";
			String b= "200";
			System.out.println(a+b);//100200
			int c = Integer.parseInt(a)+ Integer.parseInt(b);
			System.out.println(c);//300
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null) {
					br.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void me5() throws Exception {
			//�ܼ�â���� ������� �Է��� Scanner�� �̿��ؼ� ȹ��
			//��������, �� � ���� ������ BuggeredReader�� �̿�
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//system.in - ǥ���Է���ġ, Ű����
			
			System.out.println("����� ���� �����ϴ� ���� �ϳ��� �Է��Ͻÿ�.");
			
			String sNum =br.readLine();	//��� �����͸� ��Ʈ�������� �Է¹޴´�
			int num = Integer.parseInt(sNum);
			
			System.out.println("����� ���� �Ⱦ��ϴ� ���� �ϳ��� �Է��Ͻÿ�");
			String sNum2=br.readLine();
			int num2 = Integer.valueOf(sNum2);
			
			System.out.println("�� ���� ���� "+(num+num2));
			
			if(br != null) {
				br.close(); 	//������ close()
			}
			
	}
	public void me6() {
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			in = new FileInputStream("c:"+File.separator+"abc.txt");
			isr= new InputStreamReader(in);
			br = new BufferedReader(isr);
			//��Ƽ�̵�� ������ �����ʹ� ���ڽ�Ʈ���� ����� �� ����.
			
			
			String msg = null;
			while(true) {
				msg = br.readLine();
				if(msg==null) {
					break;
				}
					
					System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me7() {
		Writer out = null;
		PrintWriter pw=null;
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			
			pw.print(false);
			pw.println(false);
			pw.println(false);
			
			pw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pw != null) {
					pw.close();
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
