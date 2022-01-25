package com.eomcs.mylist.daoContact;

import java.io.File;
import org.springframework.stereotype.Repository;
import com.eomcs.mylist.domain.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class JsonContactDao extends AbstractContactDao {

  String filename = "contacts.json";


  public JsonContactDao() {

    try {
      ObjectMapper mapper = new ObjectMapper();
      contactList.addAll(mapper.readValue(new File(filename), Contact[].class));

    } catch (Exception e) {
      System.out.println("게시글 데이터 로딩 중 오류 발생!");
    }
  }

  @Override
  protected void save() throws Exception { // save는 내부적으로 호출할 것
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(filename), contactList.toArray());
  }

}
