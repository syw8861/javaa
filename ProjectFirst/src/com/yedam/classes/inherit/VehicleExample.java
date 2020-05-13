package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		
		
		vehicle = new Bus(); 
		vehicle.run();
		//버스클래스가 vehicle클래스를 상속받기때문에 타입이 맞지않더라도 생성가능
		//부모클래스 변수 = (자동형변환)자식클래스 인스턴스 할당가능
		
		
		vehicle = new Taxi();
		vehicle.run();
		//어떤 인스턴스가 vehicle변수에 할당되어있는가에 따라서 결과값이 달라진다.
		
		Taxi taxi = (Taxi)vehicle; 
		taxi.run(); 
		//부모클래스를 자식클래스로 할당할땐 강제 형변환이 필요함(자식클래스)
		//자식클래스 변수 = (강제형변환)부모클래스
	}
}
