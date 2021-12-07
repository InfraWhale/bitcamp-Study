// 변수 : 스프링부트 자동 형변환
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam3") // 클래스 이름 같을경우 충돌 방지
@RequestMapping("/lang/variable/exam3")
public class Exam3 {

  // 스프링부트는 클라이언트가 보낸 값을 파라미터 타입에 맞춰 자동 형변환을 수행한다.
  // 웹브라우저가 보내는 값은 무조건 문자열이다.

  //1) "100" ==> byte
  //localhost:8080/lang/variable/exam3/test1?value=100
  @GetMapping("/test1")
  public String test1(byte value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //2) "32767" ==> short
  //localhost:8080/lang/variable/exam3/test2?value=32767
  @GetMapping("/test2")
  public String test2(short value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //3) "456789" ==> int
  //localhost:8080/lang/variable/exam3/test3?value=456789
  @GetMapping("/test3")
  public String test3(int value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //4) "2244445555" ==>long
  //localhost:8080/lang/variable/exam3/test4?value=2244445555
  @GetMapping("/test4")
  public String test4(long value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //5) "3.14" ==>float
  //localhost:8080/lang/variable/exam3/test5?value=3.14
  @GetMapping("/test5")
  public String test5(float value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //6) "3456.7898" ==>double
  //localhost:8080/lang/variable/exam3/test6?value=3456.7898
  @GetMapping("/test6")
  public String test6(double value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //7) "true" ==> boolean
  // - "true", "1", "TRUE" ==> true
  // - "false", "0", "FALSE" ==> true
  //localhost:8080/lang/variable/exam3/test7?value=true
  @GetMapping("/test7")
  public String test7(boolean value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //8) "가" ==> char
  //localhost:8080/lang/variable/exam3/test8?value=가
  @GetMapping("/test8")
  public String test8(char value) {
    return "클라이언트에서 받은 값= " + value;
  }

  //9) "2021-12-06" ==> Date
  //localhost:8080/lang/variable/exam3/test9?value=2021-12-06
  @GetMapping("/test9")
  public String test9(java.sql.Date value) {
    return "클라이언트에서 받은 값= " + value;
  }


  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
  //  
  //  //http://localhost:8080/lang/variable/exam3/test2?b=100&s=200&i=654321&l=9220000000000000000&f=3.14&d=345.678&bool=true&c=가
  //  @GetMapping("/test2")
  //  public String test2(byte b, short s, int i, long l, float f, double d, boolean bool, char c) {
  //    return "클라이언트에서 받은 값= " + b + ","+ s + ","+ i + ","+ l + ","+ f + ","+ d + ","+ bool + ","+ c;
  //  }
}
