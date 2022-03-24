package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BoardController {

  @RequestMapping("/board/list")
  public Object list() {
    return ArrayList3.toArray();
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {
    //    System.out.println(contact);
    ArrayList3.add(board);

    return ArrayList3.size;
  }


  @RequestMapping("/board/get")
  public Object get(String title) {
    int index = indexOf(title);
    if (index == -1) {
      return "";
    }
    return ArrayList3.list[index];
  }

  @RequestMapping("/board/update")
  public Object update(Board board) {
    int index = indexOf(board.title);
    if (index == -1) {
      return 0;
    }

    return ArrayList3.set(index, board) == null ? -1 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(String title) {
    int index = indexOf(title);
    if (index == -1) {
      return 0;
    }

    ArrayList3.remove(index);  // 메서드 이름으로 코드의 의미를 짐작할 수 있다. 이것이 메서드로 분리하는 이유이다.
    return 1;
  }
  //  // 기능: 
  //  // - 입력 받은 파라미터 값을 가지고 CSV 형식으로 문자열을 만들어 준다.
  //  //
  //  String createCSV(String name, String email, String tel, String company) {
  //    return name + "," + email + "," + tel + "," + company;
  //  }
  @RequestMapping("/board/indexof")
  static int indexOf(String title) {
    for (int i = 0; i < ArrayList3.size; i++) {

      Board board = (Board) ArrayList3.list[i];

      if (board.title.equals(title)) { 
        return i;
      }
    }
    return -1;
  }







}