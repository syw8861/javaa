package com.yedam.nestedInterfaces;


class CallListener implements Button.OnClickListener
{
	@Override
	public void onClick()
	{
	System.out.println("전화를 건다ㅏㅏㅏㅏ");
	}
	
}

class MessageListener implements Button.OnClickListener
{
	@Override
	public void onClick()
	{
		System.out.println("카톡을 보낸다ㅏㅏㅏㅏㅏ");
	}
}



public class ButtonExample
{
	public static void main(String[] args)
	{
		Button btn = new Button();
		
		CallListener ButtonCallListener = new CallListener();
		btn.setOnClickListener(ButtonCallListener);
		btn.touch();
		//위랑 아래랑 같은거임 선언을 해주고 넣냐 안해주고 넣냐
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
