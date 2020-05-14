package com.yedam.classes.abstract_class;

public class Cat extends Animal{
	public Cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() { //부모클래스가 추상클래스면 부모클래스의 추상메소드를 반드시 재정의해줘야한다
		System.out.println("야옹"); //추상클래스에서는 sound 추상메소드에 내용을 못담음. 그래서 하위클래스에서 안에 구현해줄수 있음
		
	}
//	public abstract void eat(); //일반 클래스에서 추상메소드를 정의해줄려고 하면 에러가 남
}
