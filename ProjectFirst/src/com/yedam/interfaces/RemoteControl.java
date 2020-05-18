package com.yedam.interfaces;

public interface RemoteControl {
	//상수 final static(포함) --static <-클래스기준으로 한번만
	
	public int MAX_VOLUME = 0; //상수표현해주는법(상수는 한번 선언 후 못바꿔줌)
	public int MIN_VOLUME = 10;
	
	//추상메소드;
	public void turnOn();
	public void turnOff();
	
	


	
}
