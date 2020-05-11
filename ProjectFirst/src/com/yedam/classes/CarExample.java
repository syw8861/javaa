package com.yedam.classes;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "Sonata";
		System.out.println(c1.maxSpeed);
		
		Car c2 = new Car(200);
		c2.model = "BMW";
		System.out.println(c2.maxSpeed);
		
		Car c3 = new Car("Benz");
		c3.maxSpeed = 500;
		
		Car c4 = new Car("Accent", 300);
		c3.showInfo();
		c4.showInfo();
		
	}
}

//5월 11일 1교시 (main clas.s )
