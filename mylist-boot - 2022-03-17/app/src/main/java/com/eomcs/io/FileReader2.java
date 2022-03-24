package com.eomcs.io;

import java.io.FileReader;

//기존 코드를 자신의 코드인양 사용하기 위해 해당 클래스를 포함한다.
public class FileReader2 {

	// 기존의 클래스 포함!
	FileReader in;

	public FileReader2(String filename) throws Exception { 
		// 기존 객체를 준비한다.
		in = new FileReader(filename);
	}

	public String readLine() throws Exception {
		StringBuilder buf = new StringBuilder();
		int c;
		while ((c = in.read()) != -1) {// 파일에서 한 문자를 읽는다. 더이상 읽을 문자가 없으면 반복문을 종료하다.
			if (c == '\n') { // 만약 읽은 문자가 줄바꿈 명령이라면, 지금까지 읽은 CSV 데이터를 분석하여 Contact 객체에 담는다.
				return buf.toString(); // 다음 데이터를 읽기 위해 버퍼를 초기화시킨다.
			} else if (c == '\r'){
				// 무시! CR(\r) 코드는 버퍼에 담지 말고 버린다.
			} else { // 문자를 읽을 때마다 버퍼에 임시 보관한다.
				buf.append((char) c);
			}
		}		
		return buf.toString();
	}

	// 자원해제하라는 요청이 들어오면 실제 일을 하는 객체에게 전달한다.

	public void close() throws Exception{
		in.close();
	}

}

//package com.eomcs.io;
//
////기존 코드를 자신의 코드인양 사용하겠다고 선언한다.
//public class FileReader2 extends java.io.FileReader {
//
//	// 수퍼클래스의 생성자는 바로 사용할 수 없다.
//	// 서브클래스의 생성자를 통해 사용해야 한다.
//
//	public FileReader2(String filename) throws Exception { // FileReader() 생성자 바로 사용 불가
//
//		// 다음과 같이 수퍼 클래스 생성자 호출해야함
//		super(filename);
//	}
//
//	public String readLine() throws Exception {
//		StringBuilder buf = new StringBuilder();
//		int c;
//		while ((c = this.read()) != -1) {// 파일에서 한 문자를 읽는다. 더이상 읽을 문자가 없으면 반복문을 종료하다.
//			if (c == '\n') { // 만약 읽은 문자가 줄바꿈 명령이라면, 지금까지 읽은 CSV 데이터를 분석하여 Contact 객체에 담는다.
//				return buf.toString(); // 다음 데이터를 읽기 위해 버퍼를 초기화시킨다.
//			} else if (c == '\r'){
//				// 무시! CR(\r) 코드는 버퍼에 담지 말고 버린다.
//			} else { // 문자를 읽을 때마다 버퍼에 임시 보관한다.
//				buf.append((char) c);
//			}
//		}		
//		return buf.toString();
//	}
//}