package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eomcs.io.FileWriter2;
import com.eomcs.mylist.domain.Book;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.util.ArrayList;

@RestController 
public class BookController {

	ArrayList bookList = new ArrayList();

	public BookController() throws Exception {
		System.out.println("BookController() 호출됨!");
		com.eomcs.io.FileReader2 in = new com.eomcs.io.FileReader2("books.csv");

		String line;
		while ((line = in.readLine()).length() != 0) { // 빈 줄을 리턴받았으면 읽기를 종료한다.
			bookList.add(Contact.valueOf(line)); // 파일에서 읽은 한 줄의 CSV 데이터로 객체를 만든 후 목록에 등록한다.
		}

		in.close();
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

	@RequestMapping("/book/save")
	public Object save() throws Exception {
		FileWriter2 out = new FileWriter2("books.csv"); // 따로 경로를 지정하지 않으면 파일은 프로젝트 폴더에 생성된다.

		Object[] arr = bookList.toArray();
		for (Object obj : arr) {
			Book book = (Book) obj;
			out.println(book.toCsvString());
		}

		out.close();
		return arr.length;
	}


}