package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class TodoController {

  @RequestMapping("/todo/list")
  public Object list() {
    return ArrayList2.toArray();
  }

  @RequestMapping("/todo/add")
  public Object add(Todo todo) {
    ArrayList2.add(todo);

    return ArrayList2.size;
  }

  //
  //  @RequestMapping("/todo/get")
  //  public Object get(int index) {
  //    if (index <0 || index >=ArrayList2.size) {
  //      return "";
  //    }
  //    return ArrayList2.list[index];
  //  }

  @RequestMapping("/todo/update")
  public Object update(int index, Todo todo) {
    if (index <0 || index >=ArrayList2.size) {
      return 0;
    }

    return ArrayList2.set(index, todo) == null ? 0 : 1;
  }

  @RequestMapping("/todo/check")
  public Object check(int index, boolean done) {
    if (index <0 || index >=ArrayList2.size) {
      return 0; // 인덱스 무효해서 설정못함
    }

    ((Todo)ArrayList2.list[index]).done = done; //여기에 괄호 씌움 원문 ArrayList2.list[index].done = done;
    return 1; // 해당 항목 상태 변경함
  }

  @RequestMapping("/todo/delete")
  public Object delete(int index) {
    if (index <0 || index >=ArrayList2.size) {
      return 0;
    }

    ArrayList2.remove(index);  // 메서드 이름으로 코드의 의미를 짐작할 수 있다. 이것이 메서드로 분리하는 이유이다.
    return 1;
  }
  //  // 기능: 
  //  // - 입력 받은 파라미터 값을 가지고 CSV 형식으로 문자열을 만들어 준다.
  //  //
  //  String createCSV(String name, String email, String tel, String company) {
  //    return name + "," + email + "," + tel + "," + company;
  //  }








}