// 리터럴 : 문자 리터럴
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam5")
public class Exam5 {


  @GetMapping("/test1")
  public String test1() {
    return "문자1: " + 'A' + '가';

  }

  @GetMapping("/test2")
  public String test2() {
    return "문자2: " + '\u0041' + '\uac00'; // 문자에 대한 유니코드 값 지정해도 됨

  }

  @GetMapping("/test3")
  public String test3() {
    return "문자3: " + (char)0x41 + "," + (char)0xac00; // 문자 코드를 정수값으로 지정한다. 대신 문자 코드임을 표시해야 한다.
    //    return "문자3: " + 0x41 + "," + 0xac00; // 65, 44042
  }

  @GetMapping("/test4")
  public String test4() {
    return "문자4: " + (char)65 + "," + (char)44032; // 문자 코드값은 그냥 정수값이다

  }

  @GetMapping("/test5")
  public String test5() {
    return "문자5: " + '\u4eba' + '\u00a9' + '\u03c0' + '\u03a3'; // 

  }

}

