package com.yedam.exceptions;

public class NullPointerExceptions
{
	public static void main(String[] args)
	{
		String str = null;
		
		try
		{// (예외처리) try와 catch // 중간에 오류가 있으면 프로그램이 실행되다가 중간에 멈춰버려서 try catch구문을 써서 방지해준다
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		}
		catch (Exception e)
		{ // Exception <<-클래스는 최상위클래스 위의 두 구문의 에러를 알아서 잡아줌
			System.out.println("알수없는 에러가 발생했다.");
		
			// catch는 다중구문으로 사용 할 수 있다 (class.forname 저거는 자바패키지밑에 랭 밑에 스트링2는 존재하는지 안하는지
			// 체크하는거
		}
		finally
		{
			System.out.println("프로그램 종료");
		}
//		Class.forName("java.lang.String3"); //에러발생시에 마우스올려보면 surrond with try/catch눌러주면 알아서 예외처리해줌


		
	}
}
