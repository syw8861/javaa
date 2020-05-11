package com.yedam.classes;
//5월 11일 2교시(
public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(); 
		cal.powerOn();
		int result = cal.sum(10, 50);
		double result2 = cal.sum(10.5, 60.5);
		//println 메소드의 매개변수를 다르게 호출/ 실행 하도록
		//메소드 오버로딩
		cal.println("결과값은="+"30");
		cal.println(result);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(7.7, 3.1);
		cal.println("사각형의 넓이:"+area1);
		double area2 = cal.getAreaRectangle(5.5);
		cal.println("직사각형 넓이:"+area2);//정사각형은 한번만 해주는 방식으로해도 ok
		
		
		cal.println(cal.getAreaRectangle(area1, area2));
	}
}
