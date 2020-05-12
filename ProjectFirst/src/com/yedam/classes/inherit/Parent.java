package com.yedam.classes.inherit;

public class Parent {
	private String lastname;
	private String firstname;
	private String telNumber;

	public Parent() { // default생성자

	}

	public Parent(String lastname, String firstname, String telNumber) {
		super(); // Object 클래스에게 상속받고 있음// Object<<-는 최상위 클래스임
		this.lastname = lastname;
		this.firstname = firstname;
		this.telNumber = telNumber;
	}

	String getLastname() {
		return lastname;
	}

	void setLastname(String lastname) {
		this.lastname = lastname;
	}

	protected String getFirstname() {
		return firstname;
	}

	protected void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "lastName" + lastname + "firstname=" + firstname;
	}

}
