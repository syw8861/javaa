package com.yedam.classes;

public class People {
	//속성(필드) 3가지
	
	String color;
    String country;
    String city;
	//기능(메소드) 2가지
    People(String aa, String bb, String cc) {
    	this.color = aa;
    	this.country = bb;
    	this.city = cc;
    	
    }
    void play(String str1) {
    	System.out.println(str1 + "  을(를) 하는중");
    }
    void forfun(String str2) {
    	System.out.println(str2 + "을(를) 취미생활로 즐깁니다");
    }
    void showInfo() {
    	System.out.println("피부색은:"+ color +"국적은:" + country +"도시는" + city);
    }
}
