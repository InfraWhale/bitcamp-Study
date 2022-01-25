package com.eomcs.mylist.daoTodo;

import com.eomcs.mylist.domain.Todo;

public interface TodoDao {

  int countAll();

  Object[] findAll();

  void insert(Todo todo) throws Exception;

  Todo findByNo(int no);

  int update(int no, Todo todo) throws Exception;

  int delete(int no) throws Exception;

}

// 전부 public 생략가능. 인터페이스의 메서드의 기본은 public