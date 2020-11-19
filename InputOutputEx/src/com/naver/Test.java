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
		//byte stream에서 입력과 관련된 최상위 부모클래스는 InputStream
		//byte stream에서 출력과 관련된 최상위 부모클래스는 OutputStream
		//InputStream, OutputStream 추상클래스이다
		//객체 만들지마
		//I/O 객체는 반드시 개발자가 메모리를 해제시켜야 한다
//		<I/O 객체 만들기>
//		1. stream을 선언만 한다.
//		2. try ~catch ~finally 구조를 만듬
//		3. ~f 안에 t~c
//		4. f 안에 있는 try에 close() 호출,(in과 out에 if) c에 예외처리
//		5. 원 try catch에 예외처리
//		6. 원래 try를 코딩 : 객체선언
		
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");
			
			
			//파일 처음부터 끝까지 데이터를 1byte씩 읽어 온다
			//몇 번의 반복문을 사용해야 하는지 모르기에 while문을 사용
			while (true) {
			int	what = in.read();
				if(what == -1) {	// 더이상 줄게 없으면 -1을 넘겨준다.
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
				if (bis!= null) {	//필터 먼저 close
					bis.close();
				}
				if (in != null) {	//노드스트림이 필터보다 나중에 close
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
			
			
			byte[] arr = new byte[1024]; //what대신, 배열로 더 빨리
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
		
		//오브젝트인풋아웃풋 스트림
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
