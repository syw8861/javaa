package com.yedam.nestedInterfaces;

public class Button
{
	OnClickListener listener; // 인터페이스를 필드로 선언.

	void setOnClickListener(OnClickListener listener)
	{
		this.listener = listener;
	}

	void touch()
	{
		listener.onClick();
	}

	interface OnClickListener
	{
		void onClick();
	}
}
