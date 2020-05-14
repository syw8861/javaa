package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스는 인스턴스 불가능
		Animal animal = new Bird("조류"); //자식클래스가 부모클래스로는 자동형변환
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		
		animal = cat; //상속의 관계에서는 자동형변환 발생 부모변수에다가 자식변수를 넣어줄수 있음
	}
}
