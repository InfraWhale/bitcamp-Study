package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[계산기 클라이언트]");

    // 1) 서버 애플리케이션과 네트워크 연결을 수행한다.
    Socket socket = new Socket("192.168.1.146", 8888); // 서버와 연결될 때까지 객체를 생성하지 않는다.
    System.out.println("서버와 연결되었음");

    // 데이터
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    // 서버에 데이터를 보낸다.
    out.println("강사");

    // 서버가 응답한 데이터를 읽는다.
    String response = in.nextLine();
    System.out.println("==>" + response);

    // 입출력 도구 다 사용했으면 자원 해제
    out.close();
    in.close();

    // 서버 애플리케이션과 연결된 것을 끊는다.
    socket.close();
    System.out.println("서버 연결 종료!");
  }

}
