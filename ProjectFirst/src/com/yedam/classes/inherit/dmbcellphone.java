package com.yedam.classes.inherit;

public class dmbcellphone extends cellphone { // 상속받는 클래스    extends  상속해주는 부모클래스
	int channel;

	public dmbcellphone(String model, String color) {
		super(model, color); //super -> cellphone(a,b);
		
	}
	public dmbcellphone(String model, String color, int channel) {
		super(model, color); //super -> cellphone(a,b);
		this.channel = channel;
	}
	@Override //부모가 클래스가 가지고있는 메소드의 타입을 체크해주는 역할을 해준다 만약 poweron(int a) 이런식으로 해주면 안됨
	void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("dmb폰의 전원을 킴");
	}
	@Override
	void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("dmb폰의 전원을 끔");
	}
	void turnOnDmb() {
		System.out.println("채널 :" + channel + "번 방송을 수신.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번 으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 종료합니다");
	}
}
