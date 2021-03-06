package com.eomcs.oop.ex05.x3.app2;

import com.eomcs.oop.ex05.x2.Engine;

// 트럭 만들기
//
// 1) 기존 코드에 기능 덧붙이기
//
public class CarTest2 {

  public static void main(String[] args) {
    // Engine 클래스에 트럭을 위한 덤프 기능을 추가한다.
    // => dump() 메서드 추가

    Engine car = new Engine();
    car.start();
    car.run();
    car.dump();
    car.stop();

  }

}
