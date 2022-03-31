package com.eomcs.mylist.controller;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain =true) // 필드 이름으로 게터세터가 만들어진다(fluent=true) 인 경우
public class ResultMap {
  public static final String SUCCESS = "success"; // 상수값 정의 : 오타 가능성 없앰
  public static final String FAIL = "fail";
  private String status; // 세터 통해서만 접근하게 만드는거
  private Object data;
}
