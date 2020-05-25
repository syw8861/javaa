package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "Son");//  다 같은 2번 인덱스에 다 넣어주면 son이 뒤로 밀리고 그다음 yong 그다음 won이 들어옴
		list.add(2, "Yong"); //
		list.add(2, "Won"); // 한마디로 add로 같은 인덱스에 계속 넣어주면 맨 마지막에 넣어준게 맨 앞으로 옴
		list.set(2, "Kang"); // set메소드를 사용해주면 현재 인덱스2번에 뭐가 있떤 셋팅을 새로 해버림 add와는 다름
		
		
		for(String str : list)
		{
			System.out.println(str.toString());
		}
		System.out.println();
		System.out.println(list.get(1));
		System.out.println();
		
		list.remove(4); //인덱스 4번 삭제
		System.out.println("after remove(4)");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
