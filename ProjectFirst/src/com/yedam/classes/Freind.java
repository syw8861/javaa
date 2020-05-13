package com.yedam.classes;

public class Freind {
	String fname;
	String phoneNumber;
	
	public Freind(String fname, String phoneNumber){
		this.fname = fname;
		this.phoneNumber = phoneNumber;

	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	void showInfo() {
		System.out.println();
	}
}
