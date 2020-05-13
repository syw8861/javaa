package com.yedam.classes.inherit;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; // 롤메소드가 한번 돌때마다 acuumulated에 누적시킨다
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Kumho Tire 수명" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Kumho tire펑크 ***");
			return false;
		}
	}

}
