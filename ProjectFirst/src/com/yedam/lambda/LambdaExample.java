package com.yedam.lambda;
//class MyFuncClass implements MyFuntionalInterface{
//
//	@Override
//	public void run()
//	{
//		System.out.println("실행.");
//		
//	}
//}//end of myFuncclass 

public class LambdaExample
{
	public static void main(String[] args)
	{
		//매게값이 없는 인터페이스
		MyFuntionalInterface fi = new MyFuntionalInterface() 
		{
			//익명구현 객체
			@Override
			public void run()
			{
			System.out.println("실행");
				
			}
			
		};
		fi.run();
		
		
		//실행되야 할 구문이 하나 밖에 없으면 중괄호도 없어도 됌
		//간단한 람다표현식. -> run() 메소드 구현하는 부분
		MyFuntionalInterface fi2 = () -> 
			System.out.println("실행");		
		fi2.run();
		
		
		
		
		//매게값이 있는 인터페이스 람다식
		MySunInterface si  = (number1, number2) ->
		{
				int result = number1 + number2;
				System.out.println("두수의 합" + result);
		};
		si.sun(10, 20);
		
		
		//3)반환값이 존재하는 매게값이 있는 인터페이스
		MyMultiInterface mi = (num1, num2) ->
			{
				return num1 * num2;	
		};
		int result = mi.multi(10, 55);
		System.out.println("결과값은 = " + result);
	}
}
