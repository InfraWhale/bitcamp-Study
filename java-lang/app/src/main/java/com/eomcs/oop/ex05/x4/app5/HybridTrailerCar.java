package com.eomcs.oop.ex05.x4.app5;

import com.eomcs.oop.ex05.x4.app3.TrailerCar;

public class HybridTrailerCar extends TrailerCar{

  int kwh;
  public void chargeBattery(int kwh) {
    this.kwh = kwh;
  }

  @Override
  public void run() {
    // 하이브리드 전기차 구동 기능 추가
    if (kwh > 0) {
      System.out.println("전기로 간다!");
    } else {
      super.run();
    }
  }

}
