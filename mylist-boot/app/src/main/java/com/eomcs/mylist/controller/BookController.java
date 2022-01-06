package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController 
public class BookController {

	// Board 객체 목록을 저장할 메모리를 준비한다.
	ArrayList bookList = new ArrayList();

	public BookController() {
		System.out.println("BookController() 호출됨!");
	}

	@RequestMapping("/book/list")
	public Object list() {
		return bookList.toArray(); 
	}

	@RequestMapping("/book/add")
	public Object add(Book book) {
		//		book.setCreateDate(new Date(System.currentTimeMillis()));
		bookList.add(book);
		return bookList.size();
	}


	@RequestMapping("/book/get")
	public Object get(int index) {
		if (index < 0 || index >= bookList.size()) {
			return "";
		}
		Book book = (Book) bookList.get(index);
		//		book.setViewCount(book.getViewCount() + 1);
		return book;
	}

	@RequestMapping("/book/update")
	public Object update(int index, Book book) {
		if (index < 0 || index >= bookList.size()) {
			return 0;
		}

		Book old = (Book) bookList.get(index);
		//    board.viewCount = old.viewCount;
		//    board.createDate = old.createDate;
		//		book.setViewCount(old.getViewCount());
		//		book.setCreateDate(old.getCreateDate());

		return bookList.set(index, book) == null ? 0 : 1;
	}

	@RequestMapping("/book/delete")
	public Object delete(int index) {
		if (index < 0 || index >= bookList.size()) {
			return 0;
		}
		return bookList.remove(index) == null ? 0 : 1;
	}




}