package com.yedam.morning;

import java.util.Random;

public class Code20200617
{
	public static void main(String[] args)
	{
		Random ran = new Random();
		int[] num = new int[3];
		int[] chk = new int[3];

		for (int i = 0; i <num.length; i++)
		{
			int a = (int)(Math.random()*3);
			for (int j = 0; j < i; j++)
			{
				if (chk[j] == a)
				{
					i--;
					break;
				}
				num[i] = a;
			}
			System.out.println(num[i]);
		}

	}

}
