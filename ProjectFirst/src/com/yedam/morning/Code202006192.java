package com.yedam.morning;

import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

import com.yedam.morning.Code202006192.Student;

public class Code202006192
{
	private static Student[] students = { new Student("홍길동", 20, 35), new Student("신용권", 95, 93) };


//	public static double avgTotal() {
//
//		double engavg = avgEnglish1();
//		double mathavg = avgMath();
//		double totalavg = (double) (engavg+mathavg)/2;
//		
//		return totalavg;
//	}		
	
	public static double avgTotal() {
		double totlaAvg = avg(new ToIntFunction<Student>()
		{
			@Override
			public int applyAsInt(Student s)
			{
				return (s.getEnglishScore()+s.getMathScore())/2;
			}
		});
		return totlaAvg;
	}


	public static double avgEnglish1()
	{
		double englishAvg = avg(new ToIntFunction<Student>()
		{
			@Override
			public int applyAsInt(Student s)
			{
				return s.getEnglishScore();
			}
		});
		return englishAvg;
	}

	public static double avgMath()
	{
		double mathAvg = avg(new ToIntFunction<Student>()
		{
			@Override
			public int applyAsInt(Student s)
			{
				return s.getMathScore();
			}
		});
		return mathAvg;
	}

	public static void main(String[] args)
	{
		System.out.println("영어평균"+avgEnglish1());
		System.out.println("수학평균"+avgMath());
		System.out.println("전체평균"+avgTotal());
//		double englishAvg = avg(new ToIntFunction<Student>()
//		{
//			@Override
//			public int applyAsInt(Student s)
//			{
//				return s.getEnglishScore();
//			}
//		});
//		System.out.println("영어 평균 점수: " + englishAvg);
//
//		double mathAvg = avg(s -> s.getMathScore());
//		System.out.println("수학 평균 점수:" + mathAvg);
	}

	public static double avg(ToIntFunction<Student> Function)
	{
		int sum = 0;
		for (Student student : students)
		{
			sum += Function.applyAsInt(student);
		}
		return (double) sum / students.length;
		
	}
	public static class Student
	{
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScroe)
		{
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScroe;
		}

		public String getName()
		{
			return name;
		}

		public int getEnglishScore()
		{
			return englishScore;
		}

		public int getMathScore()
		{
			return mathScore;
		}
	}
}
