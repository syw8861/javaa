package com.yedam.classes;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		
		if( 100 == 100) {
			System.out.println("같음");
		}else {
			System.out.println("다룸");
		}
		if(str1.equals(str2)) {            //문자를 비교할땐 equls
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
