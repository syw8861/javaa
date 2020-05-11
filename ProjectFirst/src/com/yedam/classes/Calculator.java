package com.yedam.classes;

//5월 11일 2교시 (메소드 오버로딩
public class Calculator {
	String model;

	void powerOn() { // 메소드는 타입(void~,double, int, String) / 메소드이름 / 매개값(없으면 괄호안에 비워두면 됨)
		System.out.println("전원을 킴");
	}

	double sum(double num1, double num2) {
		return num1 + num2;
	}

	int sum(int num1, int num2) {
		return num1 + num2;
	}

	void println(String str) {
		System.out.println(str);
	}

	void println(double str) {
		System.out.println("결과값은=" + str);
	}
	void println(int str) {
		System.out.println("합계는 =" + str);
	}
	double getAreaRectangle(double width, double height) {
		return width * height;
	}
	double getAreaRectangle(double width) {
		return width * width;
	} //메소드 오버로딩이라고 함 하나의 메소드로 여러가지 출력값을 뽑고싶ㅍ을때?
}
