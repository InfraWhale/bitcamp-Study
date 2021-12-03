// 리터럴 : 문자열 리터럴과 escape character
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam6")
public class Exam6 {


  @GetMapping("/test1")
  public String test1() {
    return "0123ABC가각간똘똠똡똥";

  }

  @GetMapping("/test2")
  public String test2() {
    //- 제어 코드
    //  \n - Line Feed(LF), 0x0a
    return "012\nABC\n가각간\n똘똠똡똥";

  }

  @GetMapping("/test3")
  public String test3() {
    //- 제어 코드
    //  \r - Carrage Return(CR), 0x0d
    return "012\rABC\r가각간\r똘똠똡똥";
    // 브라우저에선 \r이 의미가 없음
  }

  @GetMapping("/test4")
  public String test4() {
    //- 제어 코드
    //  \t - Tab, 0x09

    return "012\tABC\t가각간\t똘똠똡똥";
  }

  @GetMapping("/test5")
  public String test5() {
    //- 제어 코드
    //  \b - Backspace, 0x08
    return "012\bABC\b가각간\b똘똠똡똥";
    // 브라우저에선 \b가 의미가 없음
  }

  @GetMapping("/test6")
  public String test6() {
    // 제어 코드
    //  \f - Form Feed, 0x0c
    //  \' - Single Quote, 0x27
    //  \" - Double Quote, 0x22
    //  \\ - Backslash, 0x5c
    return "012\\ABC\\가각간\\똘똠똡똥";
  }
}



