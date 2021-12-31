package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Calculator2;

public class ExamTest2 {

  public static void main(String[] args) {

    Calculator2 c1 = new Calculator2();
    Calculator2 c2 = new Calculator2();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    System.out.printf("c1.result = %d\n", c1.getResult());

    c2.plus(3); // + 3
    c2.multiple(2); // + 3 * 2
    c2.plus(7); // + 3 * 2 + 7
    c2.divide(4); // + 3 * 2 + 7 / 4
    c2.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

    System.out.printf("c2.result = %d\n", c2.getResult());

  }

}

