package com.yedam.api;

public class MamberExample
{
	public static void main(String[] args)
	{
		Member m1 = new Member("hong");
		Member m2 = new Member("kong");
		Member m3 = new Member("hong");

		if (m1.equals(m2))
		{
			System.out.println("동등하다");
		} else
		{
			System.out.println("동등하지않다.");
		}
		if (m2.equals(m3))
		{
			System.out.println("동등하다");
		}else
		{
			System.out.println("동등하지않다.");
		}if (m1.equals(m3))
		{
			System.out.println("동등하다");
		}else
		{
			System.out.println("동등하지않다.");
		}
		
		System.out.println(m1.toString()); //object 클래스가 가지고있는
		//tostring은 주소값을 가지고 온다리ㅣㅣㅣㅣㅣ
		//근데 지금은 멤버클래스에서 tostring 메소드를써서 리턴값을 바꿔줘서 설정 해준게 나옴
		if (m1 == m2)
		{
			System.out.println("동일한 객체다");
		}else
		{
			System.out.println("다른객체다");
		}
		
	}
}
