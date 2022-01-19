// 인스턴스 입출력 - DataInputStream으로 인스턴스 읽기
package com.eomcs.io.ex11.a;

public class Exam121 {

  public static void main(String[] args) {

    byte[] arr = {(byte)128, (byte)100000};
    for(int i=0; i < arr.length; i++) {
      double result = arr[i];
      System.out.println(result);
    }

  }

}


