package com.eomcs.mylist.daoContact;

import com.eomcs.mylist.domain.Contact;

public interface ContactDao {

  int countAll();

  Object[] findAll();

  void insert(Contact contact) throws Exception;

  Object get(String email);

  Object update(Contact contact) throws Exception;

  Object delete(String email) throws Exception;

}

// 전부 public 생략가능. 인터페이스의 메서드의 기본은 public