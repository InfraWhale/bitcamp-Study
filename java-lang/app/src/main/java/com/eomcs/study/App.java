package com.eomcs.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 나중에 추가된 코드
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args); //클래스명 변경 필요
  }

  @RequestMapping("/hello")
  String home() { // 클래스명 변경 필요
    return "Hello World!";
  }
}