
// 리터럴 : 숫자를 표현하는 다양한 방법 - 진수법
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam2")
public class Exam2 {

  @GetMapping("/test1")
  public int test1() {return 100;}
  //10진수(숫자를 표현할때 기본으로 많이 사용)

  @GetMapping("/test2")
  public int test2() {return 0144;}
  //8진수

  @GetMapping("/test3")
  public int test3() {return 0b01100100;}
  //2진수 0b: binary

  @GetMapping("/test4")
  public int test4() {return 0x64;}
  //16진수(문자의 코드값을 표현할때 많이 사용) 0x : hexadecimal
  // 10:a 11:b 12:c 13:d 14:e 15:f
}

// 출력될땐 다 10진수로 나옴
