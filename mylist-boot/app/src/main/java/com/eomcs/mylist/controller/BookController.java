package com.eomcs.mylist.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController 
public class BookController {

  ArrayList bookList = new ArrayList();

  public BookController() throws Exception {
    System.out.println("BookController() 호출됨!");

    BufferedReader in2 = new BufferedReader(new FileReader("books.csv")); // 주 객체에 데코레이터 객체 연결

    String line;
    while ((line = in2.readLine()) != null) { // readLine()이 null을 리턴한다면 더이상 읽을 데이터가 없다는 뜻!
      bookList.add(Book.valueOf(line));
    }

    in2.close();
  }

  @RequestMapping("/book/list")
  public Object list() {
    return bookList.toArray(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) {
    //		book.setCreateDate(new Date(System.currentTimeMillis()));
    bookList.add(book);
    return bookList.size();
  }


  @RequestMapping("/book/get")
  public Object get(int index) {
    if (index < 0 || index >= bookList.size()) {
      return "";
    }
    Book book = (Book) bookList.get(index);
    //		book.setViewCount(book.getViewCount() + 1);
    return book;
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }

    Book old = (Book) bookList.get(index);
    //    board.viewCount = old.viewCount;
    //    board.createDate = old.createDate;
    //		book.setViewCount(old.getViewCount());
    //		book.setCreateDate(old.getCreateDate());

    return bookList.set(index, book) == null ? 0 : 1;
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    return bookList.remove(index) == null ? 0 : 1;
  }

  @RequestMapping("/book/save")
  public Object save() throws Exception {
    PrintWriter out = new PrintWriter(new FileWriter("books.csv")); // 따로 경로를 지정하지 않으면 파일은 프로젝트 폴더에 생성된다.

    Object[] arr = bookList.toArray();
    for (Object obj : arr) {
      Book book = (Book) obj;
      out.println(book.toCsvString());
    }

    out.close();
    return arr.length;
  }


}