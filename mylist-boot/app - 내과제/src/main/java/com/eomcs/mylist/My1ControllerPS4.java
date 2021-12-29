package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class My1ControllerPS4 {

  String[] contactsPS4 = new String[10];
  int noPS4 = 0;

  @RequestMapping("/my1/listPS4") //무조건 앞에 슬래쉬 붙혀야함
  public Object listPS4() {
    String[] arr = new String[noPS4];
    for (int i = 0; i < noPS4; i++) {
      arr[i] = contactsPS4[i]; //  전체 배열에서 값이 들어있는 항목만 복사한다.


      //    String[] arr = new String[] {"1, 데몬즈 소울, 액션, 90"};
    }
    return arr; // 복사한 항목들을 담고 있는 새 배열을 리턴한다.
  }




  @RequestMapping("/my1/addPS4") //무조건 앞에 슬래쉬 붙혀야함
  public Object addPS4(String no, String title, String genre, String critic) {
    //    no = noPS4 + 1;
    String contact = (noPS4+1) + "," + title + "," + genre + "," + critic;
    contactsPS4[noPS4++] = contact;
    return noPS4;
  }
  //
  @RequestMapping("/my1/getPS4")
  public Object get(String title) {
    for (int i = 0; i < noPS4; i++) {
      if (contactsPS4[i].split(",")[1].equals(title)) {
        return contactsPS4[i];
      }
    }
    return "";
  }
  //
  @RequestMapping("/my1/updatePS4")
  public Object update(String no, String title, String genre, String critic) {

    for (int i = 0; i < noPS4; i++) {
      if (contactsPS4[i].split(",")[1].equals(title)) {
        String contact = (i+1) + "," +title + "," + genre + "," + critic;
        contactsPS4[i] = contact;
        return 1;
      }
    }

    return 0;
  }

  @RequestMapping("/my1/deletePS4")
  public Object delete(String title, String genre, String critic) {
    for (int i = 0; i < noPS4; i++) {
      if (contactsPS4[i].split(",")[1].equals(title)) { // 예 "ul@test.com"

        // 현재 위치의 다음 항목에서 배열 끝까지 반복하며 앞으로 값을 당겨온다.

        for (int j = i+1; j < noPS4; j++) {
          String contact = (j) + "," +contactsPS4[j].split(",")[1] + "," + contactsPS4[j].split(",")[2] + "," + contactsPS4[j].split(",")[3];
          contactsPS4[j] = contact;
          contactsPS4[j-1] = contactsPS4[j];
        }
      }
      noPS4--;
      return 1;
    }
    return 0;
  }

  @RequestMapping("/my1/countPS4")
  public Object countPS4() {
    return noPS4;
  }


}
