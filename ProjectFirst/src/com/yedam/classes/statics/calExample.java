package com.yedam.classes.statics;
//5월 11일 3교시
public class calExample {
	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.pi = 2.2;
//		calculaotr.java에다가 static을 붙이면 위에처럼 new로 사용자 지정을 안해줘도 밑에처럼 이용가능하다
		Calculator.pi = 3.14;
		Calculator.sum(45, 55);
	}
}
