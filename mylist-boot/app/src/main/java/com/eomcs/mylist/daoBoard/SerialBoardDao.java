package com.eomcs.mylist.daoBoard;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.util.ArrayList;

//@Repository
public class SerialBoardDao extends AbstractBoardDao {

  String filename = "boards.ser";

  public SerialBoardDao() {

    try {
      ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));

      boardList = (ArrayList) in.readObject(); 

      in.close();
    } catch (Exception e) {
      System.out.println("게시글 데이터 로딩 중 오류 발생!");
    }
  }

  @Override
  protected void save() throws Exception { // save는 내부적으로 호출할 것
    ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));

    out.writeObject(boardList);
    out.flush();
    out.close();
  }

}
