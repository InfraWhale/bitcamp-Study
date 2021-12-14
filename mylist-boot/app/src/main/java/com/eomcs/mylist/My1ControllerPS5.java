package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class My1ControllerPS5 {

  String[] contactsPS5 = new String[10];
  int noPS5 = 0;

  @RequestMapping("/my1/listPS5") //무조건 앞에 슬래쉬 붙혀야함
  public Object listPS5() {
    String[] arr = new String[noPS5];
    for (int i = 0; i < noPS5; i++) {
      arr[i] = contactsPS5[i]; //  전체 배열에서 값이 들어있는 항목만 복사한다.


      //    String[] arr = new String[] {"1, 데몬즈 소울, 액션, 90"};
    }
    return arr; // 복사한 항목들을 담고 있는 새 배열을 리턴한다.
  }




  @RequestMapping("/my1/addPS5") //무조건 앞에 슬래쉬 붙혀야함
  public Object addPS5(String no, String title, String genre, String critic) {
    //    no = noPS5 + 1;
    String contact = (noPS5+1) + "," + title + "," + genre + "," + critic;
    contactsPS5[noPS5++] = contact;
    return noPS5;
  }
  //
  @RequestMapping("/my1/getPS5")
  public Object get(String title) {
    for (int i = 0; i < noPS5; i++) {
      if (contactsPS5[i].split(",")[1].equals(title)) {
        return contactsPS5[i];
      }
    }
    return "";
  }
  //
  @RequestMapping("/my1/updatePS5")
  public Object update(String no, String title, String genre, String critic) {

    for (int i = 0; i < noPS5; i++) {
      if (contactsPS5[i].split(",")[1].equals(title)) {
        String contact = (i+1) + "," +title + "," + genre + "," + critic;
        contactsPS5[i] = contact;
        return 1;
      }
    }

    return 0;
  }

  @RequestMapping("/my1/deletePS5")
  public Object delete(String title, String genre, String critic) {
    for (int i = 0; i < noPS5; i++) {
      if (contactsPS5[i].split(",")[1].equals(title)) { // 예 "ul@test.com"

        // 현재 위치의 다음 항목에서 배열 끝까지 반복하며 앞으로 값을 당겨온다.

        for (int j = i+1; j < noPS5; j++) {
          String contact = (j) + "," +contactsPS5[j].split(",")[1] + "," + contactsPS5[j].split(",")[2] + "," + contactsPS5[j].split(",")[3];
          contactsPS5[j] = contact;
          contactsPS5[j-1] = contactsPS5[j];
        }
      }
      noPS5--;
      return 1;
    }
    return 0;
  }

  @RequestMapping("/my1/countPS5")
  public Object countPS5() {
    return noPS5;
  }


}
