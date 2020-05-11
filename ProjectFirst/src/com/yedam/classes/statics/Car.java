package com.yedam.classes.statics;
//5월 11일 3교시
public class Car {
	private int speed; //초기값 0 
	//private는 car class안에서만 사용ㄱ능
	private boolean stop; //초기값 : false
	
	void setSpeed(int speed) {
		if(speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	int getSpeed(){
		return this.speed;
	}
	
}
