package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
// 이 클래스가 클라이언트 요청을 처리한다는 것을 표시한다.
// 이 표시 (애노테이션) 가 붙어 있어야만 스프링부트가 인식한다
public class ContactController {

  String[] contacts = new String[5];
  int size = 0;

  @RequestMapping("/contact/list") //무조건 앞에 슬래쉬 붙혀야함
  public Object list() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = contacts[i]; //  전체 배열에서 값이 들어있는 항목만 복사한다.
    }

    return arr; // 복사한 항목들을 담고 있는 새 배열을 리턴한다.
  }

  @RequestMapping("/contact/add") //무조건 앞에 슬래쉬 붙혀야함
  public Object add(String name, String email, String tel, String company) {
    String contact = name + "," + email + "," + tel + "," + company;
    contacts[size++] = contact;
    return size;
  }

  @RequestMapping("/contact/get")
  public Object get(String email) {
    for (int i = 0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) {
        return contacts[i];
      }
    }
    return "";
  }

  @RequestMapping("/contact/update")
  public Object update(String name, String email, String tel, String company) {
    String contact = name + "," + email + "," + tel + "," + company;

    for (int i = 0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) {
        contacts[i] = contact;
        return 1;
      }
    }

    return 0;
  }

  @RequestMapping("/contact/delete")
  public Object delete(String email) {
    for (int i = 0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) { // 예 "ul@test.com"

        // 현재 위치의 다음 항목에서 배열 끝까지 반복하며 앞으로 값을 당겨온다.

        for (int j = i+1; j < size; j++) {
          contacts[j-1] = contacts[j];
        }
      }
      size--;
      return 1;
    }
    return 0;


  }


}
