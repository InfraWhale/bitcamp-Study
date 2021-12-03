// 리터럴 : 자바에서 값을 표현한 것
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam1")
public class Exam1 {

  @GetMapping("/test1")
  public String test1() {
    return "홍길동";    
    // 문자열을 표현하는 방법
  }

  @GetMapping("/test2")
  public char test2() {
    return '홍';   
    // 문자를 표현하는 방법
  }

  @GetMapping("/test3")
  public int test3() {
    return 100;   
    // 숫자를 표현하는 방법
  }

  @GetMapping("/test4")
  public double test4() {
    return 3.14;   
    // 부동소수점을 표현하는 방법
  }

  @GetMapping("/test5")
  public boolean test5() {
    return true;   
    // 논리값을 표현하는 방법
  }

  @GetMapping("/test6")
  public Object test6() {
    return null;
    // 주소가 지정되지 않았음을 표현하는 방법
  }

}
