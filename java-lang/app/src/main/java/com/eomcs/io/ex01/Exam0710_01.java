// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_01 {

  public static void main(String[] args) throws Exception {

    // 결과 예)
    // /Users/bitcamp/git/Test
    // src/
    //   main/
    //     java/
    //       com/
    //         Hello.java
    //         Hello2.java
    // build.gradle
    // settings.gradle
    // Hello.java
    // ...
    
    File dir = new File(".");
    System.out.println(dir.getCanonicalPath());
  }


}


