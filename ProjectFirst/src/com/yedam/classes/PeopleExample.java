package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		
		People peo1 = new People("yellow","koera","dague");
		People peo2 = new People("black","uk","london");
		People peo3 = new People("white","america","");
		
		People[] p1 = new People[3];
		p1[0] = peo1;
	    p1[1] = peo2;
	    p1[2] = peo3;
	    
	    for(People peod : p1) {
	    	peod.showInfo();
	    }
	}
}
