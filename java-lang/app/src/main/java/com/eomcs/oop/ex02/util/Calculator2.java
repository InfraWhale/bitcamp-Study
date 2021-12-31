package com.eomcs.oop.ex02.util;

public class Calculator2 { // public :  다른 패키지에서도 사용 가능

  public int result = 0;

  public void plus(int value) {
    this.result += value;
  }

  public void minus(int value) {
    this.result -= value;
  }

  public void multiple(int value) {
    this.result *= value;
  }

  public void divide(int value) { // 인스턴스 변수 사용할때. this.result 등등 들어갈때는 이렇게 사용 & static 안붙힘
    this.result /= value;
  }

  public int getResult() {
    return this.result;
  }

  // 인스턴스를 사용하지 않는 메서드라면 그냥 클래스 메서드로 두어라. & static 붙힘
  static int abs(int a) {
    return a >= 0 ? a : a * -1;
  }
}