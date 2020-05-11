package com.yedam.classes;

public class student {
	//속성(필드)
	String name;//이름
	int age;//나이
	double height;//키
	double weight;//몸무게 
	
	//(생성자) ->instance가 만들어질때 필드의 초기값 지정.
	public student(){ 
		System.out.println("생성자 호출");
	}
	public student(String name){
		this.name = name; //this.필드에 string타입의 뭐를 넣으면 필드에 저걸 뽑아주겠다.
	}
	//기능(메소드) - 메소드는 반환타입(void등) 이있어야 하고 (뒤에 괄호가 와야함)
	void study() {
		System.out.println("공부중.");
	}	//공부한다
	void eat(String str) {
		System.out.println(str+ "을 먹는중");
	}// 밥을먹는다
	void exercise() {
		System.out.println("운동중");
	}//운동한다
	
}
