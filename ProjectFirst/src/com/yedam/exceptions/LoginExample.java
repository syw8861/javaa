package com.yedam.exceptions;

public class LoginExample
{
	public static void main(String[] args)
	{
		try
		{
			login("white", "12345");
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			login("blue", "54321");
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException
	{
		if (id.equals("blue"))
		{
			throw new  NotExistIDException("아이디 틀렸다");
		}

		if (!password.equals("12334"))
		{
			throw new WrongPasswordException("비번도 틀렸ㄷ ");
		}
	}
}
