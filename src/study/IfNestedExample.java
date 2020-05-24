package study;

public class IfNestedExample
{
	public static void main(String[] args)
	{
		int score = (int) (Math.random() * 99) + 1;
		System.out.println(score + " 점수 ");

		String grade;

		if (score >= 90)
		{
			if (score >= 95)
			{
				grade = "A+";
			} 
			else
			{
				grade = "B+";
			}
			
			
		    } else
		    {
			if (score >= 85)
			{
				grade = "B+";
			} else
			{
				grade = "B";

			}
		}
		System.out.println("학점 :" + grade);
	}// end of main()
}// end of class
