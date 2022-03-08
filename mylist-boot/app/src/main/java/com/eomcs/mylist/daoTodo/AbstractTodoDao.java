package com.eomcs.mylist.daoTodo;

import java.util.ArrayList;
import com.eomcs.mylist.domain.Todo;

public abstract class AbstractTodoDao implements TodoDao {

  protected ArrayList<Todo> todoList = new ArrayList<>();

  protected abstract void save() throws Exception;

  @Override
  public int countAll() {
    return todoList.size();
  }

  @Override
  public Object[] findAll() {
    return todoList.toArray();
  }

  @Override
  public void insert(Todo todo) throws Exception{
    todoList.add(todo);
    save();
  }

  //  @Override
  //  public Todo findByNo(int no) {
  //    if (no < 0 || no >= todoList.size()) {
  //      return null;
  //    }
  //    return (Todo) todoList.get(no);
  //  }

  @Override
  public int update(int no, Todo todo) throws Exception{
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }

    Todo old = todoList.get(no);
    todo.setDone (old.isDone());

    todoList.set(no, todo);
    save();
    return 1;
  }

  @Override
  public int check(int no, boolean done) throws Exception{
    if (no < 0 || no >= todoList.size()) {
      return 0;  // 인덱스가 무효해서 설정하지 못했다.
    }

    todoList.get(no).setDone(done);
    save();
    return 1; // 해당 항목의 상태를 변경했다.
  }

  @Override
  public int delete(int no) throws Exception{
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    todoList.remove(no);
    save();
    return 1;
  }

}
