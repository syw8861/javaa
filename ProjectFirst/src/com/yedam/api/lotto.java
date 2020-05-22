package com.yedam.api;

import java.util.Random;

public class lotto
{
	public static void main(String[] args)
	{

		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.println("선택 번호 : ");
		int[] chkArr = new int[45];

		for (int i = 0; i < 6; i++)
		{
			int n = random.nextInt(45) + 1; // 1~45
			if (chkArr[n - 1] == 0)
			{
				chkArr[n - 1] = 1;
				selectNumber[i] = n;
			} else
			{
				i--;
			}
		}
		for (int i = 0; i < 6; i++)
		{
			System.out.println(selectNumber[i] + " ");
		}

		if (true)
		{
			return;
		}
	}
}