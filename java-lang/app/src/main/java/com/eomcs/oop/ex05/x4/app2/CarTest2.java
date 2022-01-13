package com.eomcs.oop.ex05.x4.app2;

// 트럭 만들기
//
// 2) 기존 코드를 상속하여 새 클래스를 만든 후 기능 덧붙이기
//
public class CarTest2 {

  public static void main(String[] args) {
    //  Car 클래스를 상속받아 Truck 클래스를 만든다.
    // => dump() 메서드 추가

    Truck truck = new Truck();
    truck.start();
    truck.run();
    truck.dump();
    truck.stop();

  }

}
