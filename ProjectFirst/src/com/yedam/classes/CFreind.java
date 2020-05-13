package com.yedam.classes;

public class CFreind extends Freind {
	String department;

	public CFreind(String fname, String phoneNumber, String department) {
		super(fname, phoneNumber);
		this.department = department;
	}
	@Override
	void showInfo() {
		System.out.println("이름:" + fname + "폰번호:" + phoneNumber + "부서:" + department);
	}
}
