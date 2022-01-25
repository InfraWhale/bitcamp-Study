package com.eomcs.mylist.daoBoard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import com.eomcs.mylist.domain.Board;

//@Repository
public class CsvBoardDao extends AbstractBoardDao { // variables initializer

  public CsvBoardDao() {
    // super() -> 컴파일러가 자동 삽입
    try {
      BufferedReader in = new BufferedReader(new FileReader("boards.csv"));

      String csvStr;
      while ((csvStr = in.readLine()) != null) {
        boardList.add(Board.valueOf(csvStr)); 
      }

      in.close();
    } catch (Exception e) {
      System.out.println("게시글 데이터 로딩 중 오류 발생!");
    }
  }

  @Override
  protected void save() throws Exception { // save는 내부적으로 호출할 것
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("boards.csv")));

    for (int i = 0; i < boardList.size(); i++) {
      Board board = (Board) boardList.get(i);
      out.println(board.toCsvString());
    }
    out.flush();

    out.close();
  }

}
