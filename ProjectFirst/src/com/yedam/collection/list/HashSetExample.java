package com.yedam.collection.list;

import java.util.HashSet;
import java.util.Set;

//734페이지
//set은 인덱스값이 없음

class Member
{
	String name;
	int age;

	Member(String name, int age) // 생성자 선언
	{
		this.name = name; // 생성자구성
		this.age = age;
	}

	@Override
	public String toString()
	{
		return this.name + " , " + this.age;
	}

	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
}
public class HashSetExample
{
	public static void main(String[] args)
	{
		Set<Member> members = new HashSet<>();
		members.add(new Member("Son", 10)); //순서를 자동 정렬해줌
		members.add(new Member("yong", 30 ));//위에 해쉬코드와 equals를 어떻게 써주냐에 따라서 중복값이 제거되거나 제거되지 않거나.
		members.add(new Member("Son", 20));
		members.add(new Member("yong", 10));
		members.add(new Member("Son", 10));
		
		for(Member member : members)
		{
			System.out.println(member.toString());
		}
		
		
		System.out.println();
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("rara");
		set.add("Hello");//set컬렉션은 중복값은 받아들이지 않는다.
		
		for(String str : set)
		{
			System.out.println(str.toString());
		}
	}
}
