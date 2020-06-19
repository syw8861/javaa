package com.yedam.morning;

import java.util.function.IntBinaryOperator;


class GetMax implements IntBinaryOperator{
	public int applyAsInt(int left, int right) {
		return left>right ? left : right;
	}
}

public class Code20200619
{
	private static int[] scores = {10,30,20,5,50,3};
	
	public static int maxOrMin(IntBinaryOperator operator){
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		
		return result;

	}
	
	public static void main(String[] args)
	{
		int maxresult = maxOrMin(new GetMax());
		System.out.println("최대값"+maxresult);
		
		
//		int max = maxOrMin((x,y)->Math.max(x, y));
//		
//		System.out.println("최대값"+ max);
		
		
		int min =maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right)
			{
				return left<right ? left : right;
				//left가 right보다 크면 left를 리턴하고 아니면 right를 리턴해라
			}
			
		});
		System.out.println("최소값"+min);
	}

}


