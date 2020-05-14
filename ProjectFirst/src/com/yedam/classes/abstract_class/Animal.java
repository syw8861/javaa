package com.yedam.classes.abstract_class;

public abstract class Animal { //추상클래스 ->(abstract)라는 키워드를 붙여줌
	
	String kind;
	
	public Animal(String kind) {
		this.kind = kind;
		
	}
	public void breathe() {
		System.out.println("숨을쉰다.");
	}
	public abstract void sound(); //추상메소드 -특징:Animal을 상속받는 클래스는 반드시 sound메소드를 정의해야 한다
}
