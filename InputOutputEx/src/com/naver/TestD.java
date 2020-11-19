package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestD {
	public void me1() {
		
		InputStream in =null ;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("."+File.separator+"src"+File.separator+"upload"+File.separator+"test_copy.jpg");
			bos = new BufferedOutputStream(out);
			
			int length = -1;
			byte[] arr = new byte[1024];
			while ((length=bis.read(arr)) != -1) {
				bos.write(arr, 0, length);
			}
			System.out.println("end");
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis !=null) {
					bis.close();
				}
				if (bos !=null) {
					bos.close();
				}
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

}
