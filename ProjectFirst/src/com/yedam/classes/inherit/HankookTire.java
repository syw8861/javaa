package com.yedam.classes.inherit;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() { // Tire클래스의 roll메소드 호출 overrid로
		++accumulatedRotation; // 롤메소드가 한번 돌때마다 acuumulated에 누적시킨다
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Hankook Tire 수명" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Hankook tire펑크 ***");
			return false;
		}
	}

}
