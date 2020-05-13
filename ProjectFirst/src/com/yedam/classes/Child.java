package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {

	Child() {
		super();
	}

	Child(String lastname, String firstname, String telNumber){
		super(lastname, firstname, telNumber);
	}

	void showInfo()
	{
		Child child = new Child();
//		child.getLastname();// default X
		child.getFirstname();// protected
		child.getTelNumber();
	}
}
