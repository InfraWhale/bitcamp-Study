// String - String 객체와 문자열 리터럴의 타입
package com.eomcs.basic.ex02;

public class Exam0112 {
	public static void main(String[] args) {

		String s1 = new String("Hello"); // Heap 영역에 String 인스턴스를 만든다.
		String s2 = "Hello"; // String pool 영역에 String 인스턴스를 만든다.

		// 문자열 리터럴이 String 객체인지 확인해보자.
		System.out.println(s1 == s2);
		System.out.println(s1 instanceof String); // 이 클래스로 만들었나? true
		System.out.println(s2 instanceof String); // 이 클래스로 만들었나? true
	}
}


