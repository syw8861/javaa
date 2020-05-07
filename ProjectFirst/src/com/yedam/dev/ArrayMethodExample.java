package com.yedam.dev;

public class ArrayMethodExample {
	public static void main(String[] args) {

		
		int[] intAry = { 1, 2, 3, 4, 5 };
		int result = sumAry(intAry);
		System.out.println("배열 intAry의 합:" + result);

		double[] dobAry = { 1.1, 2.2, 3.3, 4.4 };
		double result1 = avgAry(dobAry);
	    System.out.println(result1);
	
	}


	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	public static double avgAry(double[] ary) {
		// 매개값으로 받은 배열의 요소들의 평균을 계산해주는 메소드.
		double avg = 0;
		for (int i = 0; i < ary.length; i++) {
			avg += ary[i];
			
		}
		double a2 = avg / ary.length;
		return a2;
	}
	public static int sum(int a, int b) {
		return a + b;
	}

}
