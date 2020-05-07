package com.yedam.dev;

public class ArrayExample2 {
	public static void main(String[] args) {
//		System.out.println(getLargeValue(10, 20,33));
		//String result = getString("Hello", "World");
		//System.out.println(result);
		
		//int[] intAry = {1,2,3,4}; //값을 넣는방식 /처음부터 값을 지정해주고 시작하거나
		
		
		//int[] intAry2 = new int[5]; //값을 넣는방식 크기만 지정해놓고 값을 따로넣거나
		//intAry2[0] = 10;
		//intAry2[1] = 15;
		
		
		int[][] intAry3 = new int[3][3]; //배열안에 배열넣기 2차원 배열
		//설명 147P 포스트잇
		intAry3[0] = new int[] {1,2,3};
		intAry3[1] = new int[] {5,6,7};
		intAry3[2] = new int[] {8,3,2};
		
//		intAry3[0][0] = 1;//위에 intAry3[0] =new int[] {1,2,3}; 이거를 하나씩 지정해줌
//		intAry3[0][1] = 2;//위에 intAry3[0] =new int[] {1,2,3}; 이거를 하나씩 지정해줌
//		intAry3[0][2] = 3;//위에 intAry3[0] =new int[] {1,2,3}; 이거를 하나씩 지정해줌
		
		System.out.println(intAry3[0][0]);
		for(int i=0; i<intAry3.length; i++) { //
			for(int j=0; j<intAry3[i].length; j++) { //inAry3[i].length와 inAry3.length의 길이가 다르다
				System.out.print(intAry3[i][j]);
			}
				System.out.println();
		}
		
		
		String result1 = getString(new String[] { "kim", "Lee", "Park", "choi", "han" });
		System.out.println(result1);
//		int ss = getLargeValue(new int[] { 3, 6, 4, 1, 2 });
//		System.out.println(ss);
	}

	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue)
			maxValue = a;
		if (b >= maxValue)
			maxValue = b;
		if (c >= maxValue)
			maxValue = c;
		return maxValue;
	}

	public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE; // int 타입의 음수까지 계산하기 위해서 사용 integer.min_value
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] >= maxValue)
				maxValue = ary[i];

		}
		return maxValue;

	}

	public static String getString(String[] strAry) {
		String hangle = "";
		for (int i = 0; i < strAry.length; i++) {
			if (i < 1)
				hangle = strAry[0];
			else
				
			hangle = hangle + " - " + strAry[i];
		}
		return hangle;
	}

	public static String getString(String str1, String str2) {
		String result = str1 + " - " + str2;
		return str1 + " - " + str2;
	}

}
