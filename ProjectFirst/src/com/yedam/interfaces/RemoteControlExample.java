package com.yedam.interfaces;

public class RemoteControlExample
{
	public static void main(String[] args) {
		RemoteControl rc = new Audio(); //오디오 생성자가 리모트컨트롤을 구현해주는 클래스라서 가능함
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		
		//익명객체 생성 끝에 ; 닫아줘야함
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn()
			{
				// TODO Auto-generated method stub
				System.out.println("익명 객체를 켭니다");
			}

			@Override
			public void turnOff()
			{
				// TODO Auto-generated method stub
				System.out.println("익명 객체를 끕니다.");
			}//익명개체 생성
	};
	rc2.turnOn();
	rc2.turnOff();
}
}