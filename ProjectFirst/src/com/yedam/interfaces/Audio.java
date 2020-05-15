package com.yedam.interfaces;

public class Audio implements RemoteControl{//리모트컨트롤인터페이스클래스가 가지고 있는 추상메소드를 반드시 구현해야한다
	//Audio클래스를 보고 구현하는 클래스라고 함  

	@Override
	public void turnOn() {
		System.out.println("Audio를 켬");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끔");
		// TODO Auto-generated method stub
		
	} 
	
}
