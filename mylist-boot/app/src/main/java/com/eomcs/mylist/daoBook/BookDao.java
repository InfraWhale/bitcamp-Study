package com.eomcs.mylist.daoBook;

import com.eomcs.mylist.domain.Book;

public interface BookDao {

  int countAll();

  Object[] findAll();

  void insert(Book book) throws Exception;

  Book findByNo(int no);

  int update(int no, Book book) throws Exception;

  int delete(int no) throws Exception;

}

// 전부 public 생략가능. 인터페이스의 메서드의 기본은 public