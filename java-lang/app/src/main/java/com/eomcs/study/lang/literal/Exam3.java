// 
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam3")
public class Exam3 {

  @GetMapping("/test1")
  public String test1() {
    //    return "정수" +21_4748_3648; // 컴파일 오류 : 4바이트 메모리에 저장 불가
    return "정수" + 21_4748_3647;

  }

  @GetMapping("/test2")
  public String test2() {
    //    return "정수" + -21_4748_3649; // 컴파일 오류 : 4바이트 메모리에 저장 불가
    return "정수" + -21_4748_3648;

  }

  @GetMapping("/test3")
  public String test3() {
    return "정수" +21_4748_3648L; // 리터럴 저장 시 8바이트 메모리 사용하라고 표시

  }

  @GetMapping("/test4")
  public String test4() {
    return "정수" + -21_4748_3649L; 

  }

  @GetMapping("/test5")
  public String test5() {
    return "정수" + 922_0000_0000_0000_0000L; 

  }

  @GetMapping("/test6")
  public String test6() {
    return "정수" + -922_0000_0000_0000_0000L; 

  }

}

