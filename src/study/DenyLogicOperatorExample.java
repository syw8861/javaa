package study;
//논리 부정 연산자
public class DenyLogicOperatorExample
{
	public static void main(String[] args)
	{
		boolean play = true;
		System.out.println(play);
		//피연산자가 true값이면 false 출력 
		//피연산자가 false값이면 true출력
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}//end of manin()
}//end of class
