package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//731페이지
public class LinkedListExample
{
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<>();
		long startTime, endTime;
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++)
		{
			list1.add(0, String.valueOf(i)); //0번째 인덱스에다가   숫자를 문자로 바꾸는 string.valueof 를 써서 리스1 인덱스 0번째에 넣는다
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList: 걸리시간 = " + (endTime - startTime));
		
		List<String> list2 = new LinkedList<>();
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++)
		{
			list2.add(0, String.valueOf(i)); //0번째 인덱스에다가   숫자를 문자로 바꾸는 string.valueof 를 써서  리스트2의 인덱스 0번째에 넣는다
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList: 걸리시간 = " + (endTime - startTime));
	}
}
