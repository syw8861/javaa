package com.yedam.dev;

public class ddd {
	public static void main(String[] args) {
		int[][] ary =  {{11,22},
		               {33,57,34,43,45,43,65},
					   {44,12,3,5,37,7,45,6,5,4,3,}};
		int plus = 0;
		int minus = 0;
		int www = 0;
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[j].length; j++) {
				plus = plus + ary[i][j];
			}
			minus=minus + ary[i].length;
		}
		
	}
}
