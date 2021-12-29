package com.eomcs.mylist;

public class ArrayList {


  // 인스턴스 필드 (변수)
  // => 인스턴스 필드는 new 명령을 통해 생성한다.
  Object[] list = new Object[5];
  int size = 0;

  static void add(ArrayList that, Object obj) {
    if (that.size == that.list.length) { // 배열이 꽉찼다면,
      that.list = grow(that); // 메서드 이름에서 해당 코드에 대한 설명을 짐작할 수 있다.
    }
    that.list[that.size++] = obj;
  }

  static Object[] grow(ArrayList that) {
    Object[] arr = new Object[newLength(that)];
    copy(that.list, arr);
    return arr;
  }

  static int newLength(ArrayList that) {
    return that.list.length + (that.list.length >> 1);
  }

  static void copy(Object[] source, Object[] target) {
    // 개발자가 잘못 사용할 것을 대비해서 다음 코드를 추가한다.
    // 즉 target 배열이 source 배열 보다 작을 경우 target 배열 크기만큼만 복사한다.
    int length = source.length;
    if (target.length < source.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = source[i];
    }
  }

  static Object[] toArray(ArrayList that) {

    Object[] arr = new Object[that.size]; 
    for (int i = 0; i < that.size; i++) { 
      arr[i] = that.list[i]; 
    }
    return arr; 
  }

  static Object remove(ArrayList that, int index) {
    if (index < 0 || index >= that.size) {
      return null;
    }
    Object old = that.list[index];
    for (int i = index + 1; i < that.size; i++) {
      that.list[i - 1] = that.list[i];
    }
    that.size--;
    return old;
  }

  static Object set(ArrayList that,int index, Object obj) {
    if (index < 0 || index >= that.size) {
      return null;
    }
    Object old = that.list[index];
    that.list[index] = obj;
    return old;
  }
}
