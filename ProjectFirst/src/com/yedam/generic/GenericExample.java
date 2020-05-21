package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;
//제네릭 사용법 2권 655장
public class GenericExample
{
	public static void main(String[] args)
	{
//		Object[] strAry = new String[5]; //
//		strAry[0] = "Hello";
//		strAry[1] = "World";
//		strAry[2] = new Integer(0);	
//		
//		String str = (String)strAry[0];
//		Integer num = (Integer)strAry[2];
//	    Integer num1 = (Integer)strAry[1]; //인티저 타입에 스트링타입strary[1]을 타입변환해서 넣어주려고 하니까 에러가 난다
//		
		
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(new Double(2.4));
		
		String s1 = (String)list.get(0);
		String s2 = (String)list.get(1);
		Double d1 = (double) list.get(0);
		
		//제네릭.  -->> 타입을 미리 지정하는것 형변환따윈 받지않는다.
		List<String> strList = new ArrayList<String>();
//		strList.add(new Integer(0)); 리스트타입 지정을 해줘놔서 스트링타입만 넣을 수 있다. <> 여기안에 지정해줬음
		strList.add(new String("Hello")); //add라는 메소드 안에 ()안의 것이 parameter
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
	}
}
