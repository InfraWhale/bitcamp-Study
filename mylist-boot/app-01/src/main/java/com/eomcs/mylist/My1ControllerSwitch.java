package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class My1ControllerSwitch {

  String[] contactsSwitch = new String[10];
  int noSwitch = 0;

  @RequestMapping("/my1/listSwitch") //무조건 앞에 슬래쉬 붙혀야함
  public Object listSwitch() {
    String[] arr = new String[noSwitch];
    for (int i = 0; i < noSwitch; i++) {
      arr[i] = contactsSwitch[i]; //  전체 배열에서 값이 들어있는 항목만 복사한다.


      //    String[] arr = new String[] {"1, 데몬즈 소울, 액션, 90"};
    }
    return arr; // 복사한 항목들을 담고 있는 새 배열을 리턴한다.
  }




  @RequestMapping("/my1/addSwitch") //무조건 앞에 슬래쉬 붙혀야함
  public Object addSwitch(String no, String title, String genre, String critic) {
    //    no = noSwitch + 1;
    String contact = (noSwitch+1) + "," + title + "," + genre + "," + critic;
    contactsSwitch[noSwitch++] = contact;
    return noSwitch;
  }
  //
  @RequestMapping("/my1/getSwitch")
  public Object get(String title) {
    for (int i = 0; i < noSwitch; i++) {
      if (contactsSwitch[i].split(",")[1].equals(title)) {
        return contactsSwitch[i];
      }
    }
    return "";
  }
  //
  @RequestMapping("/my1/updateSwitch")
  public Object update(String no, String title, String genre, String critic) {

    for (int i = 0; i < noSwitch; i++) {
      if (contactsSwitch[i].split(",")[1].equals(title)) {
        String contact = (i+1) + "," +title + "," + genre + "," + critic;
        contactsSwitch[i] = contact;
        return 1;
      }
    }

    return 0;
  }

  @RequestMapping("/my1/deleteSwitch")
  public Object delete(String title, String genre, String critic) {
    for (int i = 0; i < noSwitch; i++) {
      if (contactsSwitch[i].split(",")[1].equals(title)) { // 예 "ul@test.com"

        // 현재 위치의 다음 항목에서 배열 끝까지 반복하며 앞으로 값을 당겨온다.

        for (int j = i+1; j < noSwitch; j++) {
          String contact = (j) + "," +contactsSwitch[j].split(",")[1] + "," + contactsSwitch[j].split(",")[2] + "," + contactsSwitch[j].split(",")[3];
          contactsSwitch[j] = contact;
          contactsSwitch[j-1] = contactsSwitch[j];
        }
      }
      noSwitch--;
      return 1;
    }
    return 0;
  }

  @RequestMapping("/my1/countSwitch")
  public Object countSwitch() {
    return noSwitch;
  }


}
