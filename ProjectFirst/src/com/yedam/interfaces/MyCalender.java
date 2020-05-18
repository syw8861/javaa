package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalender
{
	public static void main(String[] args)
	{
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		cal.set(2020,3,1);
//		System.out.print(cal.get(Calendar.YEAR)+"년");
//		System.out.print( cal.get(Calendar.MONTH)+1 +"월" );
//		System.out.print(cal.get(Calendar.DATE)+"일");
//		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		showCal(2020, 4);
	}

	public static void showCal(int year, int month)
	{
		// year, month 달력 출력.
		int today = 1;
		int lastDay = getLastDay(2020, 6);
		int dayOfWeek = getDayOfWeek(2020, 4);
		System.out.println(" [" + year + "년" + month + "월" + "]");
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < week.length; i++)
		{
			System.out.print(" "+week[i]);
		}
		System.out.println();

		for (int i = 1; i < dayOfWeek; i++)
		{
			System.out.printf("%4S", ""); // %5S 아무것도없는 3칸을 공란으로 띄우겠다.
		}

		for (int i = 0; i < lastDay; i++)
		{
			System.out.printf("%4d", today);
			if ((today + dayOfWeek) % 7 == 1)
			{
				System.out.println();
			}
			today++;
		}
	}// end of showcal method

	public static int getDayOfWeek(int year, int month)
	{
//		int dayOfWeek = 0;
//		if (month == 5)
//		{
//			dayOfWeek = 6;
//		} else if (month == 6)
//		{
//			dayOfWeek = 2;
//		}
//		return dayOfWeek;
//	}
		Calendar cal = Calendar.getInstance();
		int result;
		cal.set(year , month -1 ,1);
		result = cal.get(Calendar.DAY_OF_WEEK);
		
		return result;
	}
	public static int getLastDay(int year, int month)
	{
		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0))
		{
			lastDay = 31;
		} else if (month == 2)
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				lastDay = 29;
			} else
			{
				lastDay = 28;
			}
		else
		{
			lastDay = 30;
		}
		return lastDay;
	}
}// end of class
// 1-31 / 2-29 / 3-31 4-30 5-31 6-30 7-31 8-31 9-30 10-31 11-30 12-31