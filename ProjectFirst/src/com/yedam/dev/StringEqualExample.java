package com.yedam.dev;

class Student {
	String name;
}

public class StringEqualExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		st1.name = "hong";
		st2.name = "park";
		System.out.println(st1);
		System.out.println(st2);
		String str1 = "Hello"; // new String("Hello");
		String str2 = "Hello";// hello라는 데이터를 스택영역에 저장?
		String str3 = new String("Hello"); // new라는 객체를 참조값으로 생성해줌
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		if (str1 == str2) {
			System.out.println("참조가 같다");
		} else {
			System.out.println("참조가 다르다.");
		}
		if (str1 == str3) {
			System.out.println("참조가 같다");
		} else {
			System.out.println("참조가 다르다.");
		}

	}
}