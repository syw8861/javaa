package com.yedam.classes;

public class UFreind extends Freind {
	String major;
	
	    public UFreind(String fname, String phoneNumber, String major){
		super(fname,phoneNumber);
		this.major = major;
	}
	
	@Override
	void showInfo() {
		System.out.println("이름:" + this.fname + "폰번호: "+ this.phoneNumber +"전공: "+major);
	}
}
