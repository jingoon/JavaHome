package InputOutputExmple;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputEx {
	//1-1.파일(이미지)복사 
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
	//1-2. 배열을 이용하여 파일스트림의 속도 향상
	//- 뭉텅이로 옮겨서 속도를 올린다
		public void me2() {
			InputStream in= null;
			OutputStream out = null;
			try {
				
				in = new FileInputStream("c:"+File.separator+"test.jpg");
				out = new FileOutputStream("c:"+File.separator+"test_copy2.jpg");
				
				
				byte[] arr = new byte[1024]; //what대신, 배열로 더 빨리 배열은 2의 배수로 설정, 더 빠르다
				int length=-1;
				while((length = in.read(arr)) !=-1) {// 더이상 읽을 값이 없으면 read는 -1을 반환 한다, length개가 된다
					
					out.write(arr,0,length);	//배열을 출력한다 첫 인덱스부터 현재 length까지
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
	//2-1. 파일스트림으로 받은 데이터를 버퍼에서 한계까지 모아서 전달한다 (속도 향상)

	public void me3() {
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);	// 필터 채이닝
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
				if (bis!=null) {	//필터를 먼저 닫는다
					bis.close();
				}
				if (bos!=null) {	//필터를 먼저 닫는다
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

	//2-2. 배열을 버퍼에 적용하여 속도 더욱 향상
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
				out = new FileOutputStream("."+File.separator+"src"+File.separator+"img"+File.separator+"test_copy.jpg");// 상대경로
				bos = new BufferedOutputStream(out);
				
				byte[] arr = new byte[1024];
				int length = -1;
				while ((length=bis.read(arr)) != -1) {
					bos.write(arr, 0, length);
					
				}
				System.out.println("복사 끝");
				
				
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
