package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample
{	
	static class Member
	{
		String name;
		int age;
		Member(String name, int age) //생성자생성
		{
			this.name = name;
			this.age = age;
		}
		public String getName()
		{
			return name;
		}
		
		public int getAge()
		{
			return age;
		}
		
	}
	public static void main(String[] args)
	{	
		List<Member> members = new ArrayList<>(); //공간할당
		members.add(new Member("Son", 1));
		members.add(new Member("Yong", 2));
		members.add(new Member("Won", 3));
		
		for(Member mem : members)
		{
			System.out.println("이름"+mem.getName() +"나이"+ mem.getAge());
		}
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("쇼발ㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹ");
		list.add("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		list.add("ㅎㅎㅎㅎㅎㅎㅎ");
		list.add(3, "Www"); //3번째번째 인덱스에다가 저걸 넣겠다
		
		String str1 = list.get(0); // 쇼발ㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹ이 출력됌 인덱스0번째
		list.remove(2); // 인덱스[2]를 지우겠다.
		
//		for(int i=0; i<list.size(); i++ )
//		{
//			System.out.println(list.get(i));
//		}
		for(String str : list) 
		{
			if(str != null) 
			{
				System.out.println(str);
			}
		}
	}
}
