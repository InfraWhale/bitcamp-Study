// 변수 : 값을 저장할 메모리를 준비시키는 명령어
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam4") // 클래스 이름 같을경우 충돌 방지
@RequestMapping("/lang/variable/exam4")
public class Exam4 {

  // static/lang/literal/variable/exam4/test1.html
  @GetMapping("/test1")
  public String test1(int v1, int v2, String op) {
    int result = 0;
    switch (op) {
      case"+": result = v1 + v2; break;
      case"-": result = v1 - v2; break;
      case"*": result = v1 * v2; break;
      case"/": result = v1 / v2; break;
      case"%": result = v1 % v2; break;
      default: return "해당 연산을 수행할 수 없습니다.";
    }

    // 서버 렌더링

    String html= "<!DOCTYPE html>"
        + "<html>"
        + "<head>"
        + "<meta charset=\"UTF-8\">"
        + "<title>변수활용</title>"
        + "</head>"
        + "<body>"
        + "<h1>계산 결과</h1>"
        + "<p>" +v1 + " " +op+ " " + v2 + " = " + result + "</p>"
        + "</body>"
        + "</ html>";


    return html;

    //  html = html + "<h1>계산기2</h1>";//    html = html + "<html>";
    //  html = html + "<head>";
    //  html = html + "<meta charset=\"UTF-8\">";
    //  html = html + "<title>변수활용</title>";
    //  html = html + "</head>";
    //  html = html + "<body>";

  }


  // static/lang/literal/variable/exam4/test2.html
  @GetMapping("/test2")
  public Object test2(int v1, int v2, String op) { // Object : 객체
    System.out.println(">" + v1 + "<");
    System.out.println(">" + v2 + "<");
    System.out.println(">" + op + "<");

    int result = 0;
    switch (op) {
      case"+": result = v1 + v2; break;
      case"-": result = v1 - v2; break;
      case"*": result = v1 * v2; break;
      case"/": result = v1 / v2; break;
      case"%": result = v1 % v2; break;
      default: return "해당 연산을 수행할 수 없습니다.";
    }


    return Integer.toString(result);
    // java.lang 패키지의 경우는 요거 생략 가능

  }

  // static/lang/literal/variable/exam4/test2.html
  @GetMapping("/test3")
  public Object test3() { 

    String[] names;
    names = new String[] {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
    return names; // 스프링부트는 이 메서드가 리턴한 배열을 제이슨 형식의 문자열로 바꿔 응답한다.

  }

}
