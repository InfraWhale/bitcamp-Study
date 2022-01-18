// 폴더 정보 조회 - java.io.File 클래스
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    // File 클래스
    // => 디렉토리나 파일을 다룰 때 사용하는 클래스이다.
    // => 디렉토리나 파일을 생성, 삭제, 변경할 수 있다.

    // 현재 디렉토리를 조회
    // => '.' 으로 표현한다.
    // => JVM을 실행하는 위치가 현재 폴더이다.
    // => 이클립스 : 프로젝트 디렉토리를 가리킨다.
    // => 콘솔 : 현재 명령어를 실행하는 위치를 가리킨다.
    //
    File currentDir = new File("./src/main/java");
    System.out.printf("폴더명: %s\n", currentDir.getName());
    System.out.printf("경로: %s\n", currentDir.getPath()); // 컴파일러에 넘겨준 경로
    System.out.printf("절대경로: %s\n", currentDir.getAbsolutePath()); // 여기에 들어간 . 이 남아버림
    System.out.printf("계산된 절대경로: %s\n", currentDir.getCanonicalPath()); // 위의 필요없는 경로 빼버릴때

    System.out.printf("총크기: %d\n", currentDir.getTotalSpace());
    System.out.printf("남은크기: %d\n", currentDir.getFreeSpace());
    System.out.printf("가용크기: %d\n", currentDir.getUsableSpace()); // 만약 다른 용도로 확보된 공간이 있으면 이게 FreeSpace보다 작을 수 있음.
    // 개발자가 실제로 쓰는 공간 크기임.

    System.out.printf("디렉토리여부: %b\n", currentDir.isDirectory());
    System.out.printf("파일여부: %b\n", currentDir.isFile());
    System.out.printf("감춤폴더: %b\n", currentDir.isHidden());
    System.out.printf("존재여부: %b\n", currentDir.exists()); // ./src/main/java2 - 존재하지 않는 폴더이므로 false 
    System.out.printf("실행가능여부: %b\n", currentDir.canExecute());
  }

}


