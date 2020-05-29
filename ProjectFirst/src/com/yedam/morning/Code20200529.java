package com.yedam.morning;

import java.util.Random;
import java.util.Scanner;

public class Code20200529
{
	public static void main(String[] args)
	{
		int[] randomnumber = new int[3];
		int[] selnumber = new int[3];
		Random random = new Random();
		Scanner scn = new Scanner(System.in);

		boolean aa = true;
		while (aa)
		{
			int strike = 0;
			int ball = 0;
			System.out.println("1~9 중에 번호 선택 3개: ");
			selnumber[0] = scn.nextInt();
			selnumber[1] = scn.nextInt();
			selnumber[2] = scn.nextInt();
			
			for (int i = 0; i < 3; i++)
			{
				int[] checknumber = new int[9];
				int n = random.nextInt(9) + 1;

				if (checknumber[n - 1] == 0)
				{
					checknumber[n - 1] = 1;
					randomnumber[i] = n;
				} else
				{
					i--;
				}
				for (int j = 0; j < selnumber.length; j++)
				{
					if (randomnumber[i] == selnumber[j])
					{
						if (i == j)
						{
							strike++;
						} else
						{
							ball++;
						}
					}
				}
				aa = false;
			}
			System.out.println("스트라이크 =" + strike + "볼 = " + ball);
		}
	}
}
