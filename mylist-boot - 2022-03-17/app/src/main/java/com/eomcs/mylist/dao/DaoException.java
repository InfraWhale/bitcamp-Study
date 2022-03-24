package com.eomcs.mylist.dao;

// RuntimeException은 ...
// 컴파일러는...
// 그래서 ...
//
// DAO 객체에서 예외 상황이 발생했을 떄 그 예외를 다루기 쉽도록 RuntimeException에 담아
// 호출자에게 던지는 것이 유지보수에 편하다.
//
public class DaoException extends RuntimeException{
  private static final long serialVersionUID = 1L;

  public DaoException() {
    super();
  }

  public DaoException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public DaoException(String message, Throwable cause) {
    super(message, cause);
  }

  public DaoException(String message) {
    super(message);
  }

  public DaoException(Throwable cause) {
    super(cause);
  }




}
