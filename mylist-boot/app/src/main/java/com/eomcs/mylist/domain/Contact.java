package com.eomcs.mylist.domain;

public class Contact {
	String name;
	String email;
	String tel;
	String company;

	public Contact() {
		System.out.println("C 호출됨 !");
	}


	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + ", company=" + company
				+ "]";
	} // 설계도에 따라 만든 인스턴수 변수 값을 한 줄의 문자열로 만듬

	public String getName() { // 꺼내는
		return name;
	}
	public void setName(String name) { // 설정하는
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
