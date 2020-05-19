package com.yedam.api.String;

public class ByteToStringExample
{
	public static void main(String[] args)
	{
		byte[] bytes = {72, 101, 108 , 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		byte[] bytess = {77, 121, 110, 97, 109, 101, 96, 105, 115,
				83,79,78};
		
		String str3 = new String(bytess);
		System.out.println(str3);
		
		String str4 = new String(bytess, 9, 3);
		System.out.println(str4);
		
	}
}
