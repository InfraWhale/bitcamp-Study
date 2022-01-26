package com.eomcs.mylist.daoBoard;

import com.eomcs.mylist.domain.Board;

public interface BoardDao {

  // 인터페이스는 객체의 메서드 호출 규칙을 정의하는 것이기 때문에
  // 메서드를 작성할 때 메서드 몸체(method)를 작성하지 말아야 한다.
  // 메서드 바디가 없는 메서드를 "추상메서드(abstract)"라 부른다.

  int countAll();

  Object[] findAll();

  void insert(Board board) throws Exception;

  Board findByNo(int no);

  int update(int no, Board board) throws Exception;

  int delete(int no) throws Exception;

  void increaseViewCount(int no) throws Exception;
}

// 전부 public 생략가능. 인터페이스의 메서드의 기본은 public