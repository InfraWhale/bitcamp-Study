package com.eomcs.mylist.daoBook;

import java.io.File;
import org.springframework.stereotype.Repository;
import com.eomcs.mylist.domain.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class JsonBookDao extends AbstractBookDao {

  String filename = "books.json";


  public JsonBookDao() {

    try {
      ObjectMapper mapper = new ObjectMapper();
      bookList.addAll(mapper.readValue(new File(filename), Book[].class));

    } catch (Exception e) {
      System.out.println("게시글 데이터 로딩 중 오류 발생!");
    }
  }

  @Override
  protected void save() throws Exception { // save는 내부적으로 호출할 것
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(filename), bookList.toArray());
  }

}
