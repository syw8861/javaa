package study;

public class CheckOverflowExample
{
	public static void main(String[] args)
	{
		try
		{
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
				
			System.out.println("오버플로우가 발생해서 정확하게 계산 불가능");
		}
		finally 
		{
			System.out.println("finnally");
		}
	}// end of main()

	public static int safeAdd(int left, int right)
	{
		if((right>0))
		{
			if(left>(Integer.MAX_VALUE - right))
			{
				throw new ArithmeticException("최대값 오버플로우 발생");
			}
		}
		else
		{
			if(left<Integer.MIN_VALUE - right)
			{
				throw new ArithmeticException("최소값 오버플로우 발생");
			}
		}
		return left + right;
	}
}// end of class
