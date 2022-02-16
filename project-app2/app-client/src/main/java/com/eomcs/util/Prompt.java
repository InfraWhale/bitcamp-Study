package com.eomcs.util;

import java.util.Scanner;

public class Prompt {
	static Scanner keyScan = new Scanner(System.in);

	public static String promptString(String titleFormat, Object...args) { //가변 파라미터 -> 여러개의 파라미터가 들어올수 있음
		System.out.print(String.format(titleFormat, args));
		return keyScan.nextLine();
	}

	public static int promptInt(String titleFormat, Object...args) {
		return Integer.parseInt(promptString(titleFormat, args));
	}

}
