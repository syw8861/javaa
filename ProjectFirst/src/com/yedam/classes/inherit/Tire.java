package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; //타이어 최대수명
	public int accumulatedRotation; //현재 사용된 회전수
	public String location;
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation; //롤메소드가 한번 돌때마다 acuumulated에 누적시킨다
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명" + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "tire펑크 ***");
			return false;
		}
	}
}
