package com.yedam.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0; i<5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 kumhoTire 교체");
				car.frontRightTire = new KumhoTire("", 16);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("", 17);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("", 18);
				break;
			}//end of switch
			System.out.println("============================");
		}//end of for loop
	}//end of main()
}//end of class