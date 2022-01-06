package com.eomcs.mylist.domain;

import java.sql.Date;

public class Book { // 독서록용
	String title;
	String author;
	String press;
	int page;
	int price;
	Date readDate;
	String feed;

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", press=" + press + ", page=" + page + ", price="
				+ price + ", readDate=" + readDate + ", feed=" + feed + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getReadDate() {
		return readDate;
	}

	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}


}