package com.eomcs.util;

public class ArrayList {


  // 인스턴스 필드 (변수)
  // => 인스턴스 필드는 new 명령을 통해 생성한다.
  Object[] list = new Object[5];
  int size = 0;

  public void add(Object obj) {
    if (this.size == this.list.length) {
      this.list = this.grow();
    }
    this.list[this.size++] = obj;
  }

  // 인스턴스 주소를 앞쪽에서 받으려면 static 키워드 붙이면 안됨
  // 즉 non -static메서드로 정의해야 한다.
  // 그리고 메서드가 호출될 때 받은 인스턴스를 사용하려면 내장 변수 this를 이용해야 한다.
  Object[] grow() {
    Object[] arr = new Object[this.newLength()];
    this.copy(arr);
    return arr;
  }

  int newLength() {
    return this.list.length + (this.list.length >> 1);
  }

  void copy(Object[] target) {
    // 개발자가 잘못 사용할 것을 대비해서 다음 코드를 추가한다.
    // 즉 target 배열이 source 배열 보다 작을 경우 target 배열 크기만큼만 복사한다.
    int length = this.list.length;
    if (target.length < this.list.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = this.list[i];
    }
  }

  public Object[] toArray() {

    Object[] arr = new Object[this.size]; 
    for (int i = 0; i < this.size; i++) { 
      arr[i] = this.list[i]; 
    }
    return arr; 
  }

  public Object remove(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    Object old = this.list[index];
    for (int i = index + 1; i < this.size; i++) {
      this.list[i - 1] = this.list[i];
    }
    this.size--;
    return old;
  }

  public Object set(int index, Object obj) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    Object old = this.list[index];
    this.list[index] = obj;
    return old;
  }

  public int size() { // 원래 있는 메서드인 size()를 모방하는것 - > 내부에 있는 변수값을 리턴함 // 쓰는 이유 모르겠음
    return this.size;
  }

  public Object get(int index) { // 쓰는 이유 모르겠음
    return this.list[index];
  }

}