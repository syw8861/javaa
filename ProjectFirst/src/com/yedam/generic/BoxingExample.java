package com.yedam.generic;

public class BoxingExample
{
	public static void main(String[] args)
	{
		Box<Integer> box = Utils.boxing(new Integer(10));
		Integer num = box.get();
		System.out.println(num);
		
		Box<String> strbox = Utils.boxing(new String("Son"));
		String result = strbox.get();
		System.out.println(result);
		
		
	}
}
