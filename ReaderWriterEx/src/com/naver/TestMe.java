package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestMe {
	public void me1() {
		Writer out = null;

		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("good");
		try {
			out = new FileWriter("C:" + File.separator + "ss2.txt");
			out.write("강");
			out.write("\n");
			for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i));
				out.write(System.getProperty("line.separator"));
			}
			out.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("list 쓰기");
	}

	public void me2() {

		Writer out = null;

		try {
			out = new FileWriter("c:" + File.separator + "ss2.txt");
			out.write("testme");
			out.write(System.getProperty("line.separator"));

			Set<String> set = new HashSet<String>();
			set.add("hello 1");
			set.add("good 2");
			set.add("world 3");
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String msg = it.next();
				out.write(msg);
				out.write(System.getProperty("line.separator"));
			}

			out.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("set을 쓰기");
	}

	public void me3() {
		// map으로 출력
		Writer out = null;
		try {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me4() {

		Reader in = null;
		try {

			in = new FileReader("c:" + File.separator + "ss.txt");

			char[] arr = new char[1024];
			int length = -1;
			while (true) {
				length = in.read(arr, 0, arr.length);
				if (length == -1) {
					break;
				}
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me5() {

		Reader in = null;

		try {

			in = new FileReader("c:" + File.separator + "test.jpg");

			char[] arr = new char[2048];
			int length = -1;

			while (true) {
				length = in.read(arr, 0, arr.length);
				if (length == -1) {
					break;
				}
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me6() {

		Reader in = null;
		try {
			in = new FileReader("c:" + File.separator + "ss.txt");
			char[] arr = new char[1024];
			int length = -1;
			while (true) {
				length = in.read(arr, 0, length);
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me7() {
		Reader in = null;

	}

	public void me8() {

		BufferedReader br = null;
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);

			System.out.println("숫자하나를 입력");
			String s = br.readLine();
			int n = Integer.parseInt(s);

			System.out.println("숫자 하나를 또 입력");
			String s2 = br.readLine();
			int n2 = Integer.valueOf(s2);

			System.out.println("입력한 두수의 합:" + (n + n2));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me9() {
		Writer out = null;
		PrintWriter pw = null;
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);

			pw.print(false);
			pw.println(false);
			pw.println(false);
			pw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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

	public void me91() {
		Writer out = null;
		PrintWriter pw = null;

		Reader in = null;
		BufferedReader br = null;
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			pw.print(false);
			pw.println(false);
			pw.println(false);
			pw.flush();

			in = new FileReader("aaa.txt");
			br = new BufferedReader(in);

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					break;
				}
				System.out.println(msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
