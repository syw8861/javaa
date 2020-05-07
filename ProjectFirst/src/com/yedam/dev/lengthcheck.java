package com.yedam.dev;

public class lengthcheck {
	
	public static void main(String[] args) {
		int[][] array = new int[3][];
		array[0] = new int[] {95, 86};
		array[1] = new int[] {83, 92, 96};
		array[2] = new int[] {78, 83, 93, 87, 88};
		
		int sum = 0;
		double avg = 0;
		int qqq = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++){
				sum = sum + array[i][j];	
			}
			qqq = qqq + array[i].length;  
		}
		 avg = sum / qqq;
		System.out.println(avg);
		System.out.println(sum);
		System.out.println(qqq);
	}
}
