package com.yedam.generic;

public class Box<T>
{
	T object;
	
	void set(T object)
	{
		this.object = object;
	}
	
	T get()
	{
		return object;
	}
	
}
//T는 지금은 내가 타입을 지정하지 않지만 실행하는 시점에 타입을 지정해주겠다 라는 말?
//T는 type parameter라고 함 T라고 안써도됨 그냥 영어대문자 1글자면 됌