// 리터럴 : 부동소수점 리터럴과 같은 범위
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam4")
public class Exam4 {


  @GetMapping("/test1")
  public String test1() {
    float value = 987.6543f; //4바이트 메모리 사용. 
    return "부동소수점: " + value;

  }

  @GetMapping("/test2")
  public String test2() {
    double value = 987654321.1234567; //8바이트 메모리 사용
    return "부동소수점: " + value;

  }

  @GetMapping("/test3")
  public String test3() {
    float value = 987.654321f; //4바이트 메모리 크기(유효자릿수 7자리) 넘어간 값은 짤림
    return "부동소수점: " + value;
  }

  @GetMapping("/test4")
  public String test4() {
    double value = 87654321.12345678987654321; //8바이트 메모리 크기(유효자릿수 15자리) 넘어간 값은 짤림
    return "부동소수점: " + value;

  }

}

