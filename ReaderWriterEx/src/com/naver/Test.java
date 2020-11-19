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
		//출력을 하면 파일이 만들어짐
		Writer out =null;
		
		String[] arr = {"hello", "world", "good"};
		
		try {
			out = new FileWriter("c:"+File.separator+"ss.txt"); // 파일구분자/ 
			
			out.write("kim");	//하나씩 입력 가능
			out.write(System.getProperty("line.separator"));	// 줄바꿈 \r\n
			
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			//입력과 출력을 동시에 구현 할 때에는 
			//close()가 입력의 아래에 코딩되어 있어서
			// 출력시 스트림에 남아있는 데이터가 있을 수 있다
			// 그걸 방지하기 위해 out.flush() 를 사용
			out.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();		// 스트림에 남아있는 데이터를 모두 넘기고 닫는다
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
				for (int i = 0; i <arr.length; i++) { // arr.length면 이상한값이 추가됨
					System.out.print(arr[i]);
				}
			//	System.out.print((char)what);	//what을 그냥 출력하면 숫자 출력됨
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
			out.write("목요일");
			out.write(System.getProperty("line.separator"));
			out.write("5");
			out.write(System.getProperty("line.separator"));
			out.flush();		// 입출력 동시작업시 쓰기가 끝나면 작성
			
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
		//pair를 마춘다
		//페어를 안마추는 이유는 많이 사용되는데 , 다른것은 사용안함
		//BufferedReader - BufferedWriter(사용안함)
		//Scanner와 대응
		
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
			//콘솔창에서 사용자의 입력을 Scanner를 이용해서 획득
			//예전에는, 또 어떤 곳은 아직도 BuggeredReader를 이용
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//system.in - 표준입력장치, 키보드
			
			System.out.println("당신이 가장 좋아하는 숫자 하나를 입력하시오.");
			
			String sNum =br.readLine();	//모든 데이터를 스트링형으로 입력받는다
			int num = Integer.parseInt(sNum);
			
			System.out.println("당신이 가장 싫어하는 숫자 하나를 입력하시오");
			String sNum2=br.readLine();
			int num2 = Integer.valueOf(sNum2);
			
			System.out.println("두 수의 합은 "+(num+num2));
			
			if(br != null) {
				br.close(); 	//변수만 close()
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
			//멀티미디어 파일의 데이터는 문자스트림을 사용할 수 없음.
			
			
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
