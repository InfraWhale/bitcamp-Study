package com.eomcs.oop.ex11.overview.step6;

import java.util.Arrays;

public class MyList {
  Object[] arr = new Object[10];
  int size;

  public void add(Object obj) {
    if (size == arr.length) {
      arr = Arrays.copyOf(arr,  arr.length + (arr.length >> 1));
    }
    arr[size++] = obj;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("");
    }
    return arr[index];
  }

  public int size() {
    return size;
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("");
    }

    Object old = arr[index];

    for (int i = index; i < size - 1; i++) {
      arr[i] = arr[i+1];
    }

    arr[--size] = null; // 배열의 크기를 줄이고, 마지막 항목에 들어 있는 값을 null로 초기화하여 객체의 레퍼런스를 줄인다.
    return old;
  }

  public Iterator iterator() {

    class ListIterator implements Iterator {
      // local class(로컬 클래스)
      // - 메서드나 특정 블록 안에서만 사용될 클래스라면
      //   그 메서드나 블록에서 클래스를 정의함으로써
      //   명시적....
      int cursor;

      @Override
      public boolean hasNext() {
        return cursor < MyList.this.size(); // 바깥 클래스 객체 주소 사용 (MyList의 size를 사용하는 거라고 말해주는거)
      }

      @Override
      public Object next() {
        return MyList.this.get(cursor++);
      }
    }
    return new ListIterator();
  }
}
