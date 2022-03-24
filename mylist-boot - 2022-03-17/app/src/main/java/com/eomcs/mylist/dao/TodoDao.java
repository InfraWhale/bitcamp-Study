package com.eomcs.mylist.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.eomcs.mylist.domain.Todo;

@Mapper
public interface TodoDao {

  int countAll();

  List<Todo> findAll();

  int insert(Todo todo);

  Todo findByNo(int no);

  int update(Todo todo);

  int delete(int no);

  int check(Todo todo);

}

// 전부 public 생략가능. 인터페이스의 메서드의 기본은 public