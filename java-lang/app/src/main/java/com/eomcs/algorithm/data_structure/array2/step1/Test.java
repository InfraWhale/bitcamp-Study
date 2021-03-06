package com.eomcs.algorithm.data_structure.array2.step1;

import com.eomcs.algorithm.data_structure.array2.Score;

public class Test {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(new Score("홍길동", 100,100,100));
    list.add(new Score("홍길동", 90,90,90));
    list.add(new Score("홍길동", 80,80,80));
    list.add(new Score("홍길동", 70,70,70));
    list.add(new Score("홍길동", 80,90,100));

    for (int i =0; i< list.size(); i++) {
      // 불편1:
      // => 목록에서 값을 꺼낼 때마다 원래의 타입으로 형변환 한 후 사용해야 한다.
      //
      Score s = (Score) list.get(i);
      System.out.printf("%s: %d, %f\n", s.name, s.sum, s.aver);
    }
  }
}
