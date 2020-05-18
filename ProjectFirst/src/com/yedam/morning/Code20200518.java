package com.yedam.morning;

public class Code20200518
{
	public static void main(String[] args)
	{
		int[] ary = { 10, 8, 5, 3, 7, 1 };
		int temp;

		for (int i = 0; i < ary.length - 1; i++)
		{
			for (int j = i + 1; j < ary.length; j++)
			{
				if (ary[i] > ary[j])
				{
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}

		for (int i : ary)
		{
			System.out.println(i);
		}

	}// end of main()
}// end of class
