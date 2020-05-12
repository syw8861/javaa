package com.yedam.classes.inherit;

public class DmbExample {
	public static void main(String[] args) {
		dmbcellphone dcp = new dmbcellphone("DMB폰", "흰색", 10);
		dmbcellphone dcp1 = new dmbcellphone("rara", "white");
		//부모클래스 cellphone이 가지고 있는 필드
		System.out.println(dcp.model + ", " + dcp.color); // dmbcellphone에 상속매개2개+자기필드 =3 개짜리
		//자기 클래스(DMBcellphone)필드
		System.out.println(dcp1.model + dcp1.color); //dmbcellphone에 생성자 매개값2개짜리
		System.out.println(dcp.channel);
		//부모클래스의 메소드 
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoices("hi");
		dcp.receiveVoices("haha");
		//자신의 클래스의 메소드
		dcp.turnOnDmb();
		dcp.changeChannel(15);
		dcp.turnOffDmb();
		
		dcp.powerOff();
	}
}
