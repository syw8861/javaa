package com.yedam.dev;

public class ArrayExample {
	public static void main(String[] args) {

		int[] intAry = new int[5]; // int.type의 배열(intary) 5칸 생성
		intAry[0] = 10; // [0]이라는 index 1번칸에 10
		intAry[1] = 15; // 1이라는 인덱스2번칸에 15
		intAry[2] = 20;
		intAry[3] = 25;
		intAry[4] = 30;
		// intAry[5] = 35; //5칸만 생성해줘서 이건 오류 배열범위초과임
		int[] intAry2 = { 1, 2, 3, 4, 5 }; // intary2라는 변수안에 값을 바로 넣어줄때 이렇게 사용
		System.out.println(intAry2[0]);
		System.out.println(intAry2[1]);
		System.out.println(intAry2[2]);
		System.out.println(intAry2[3]);
		System.out.println(intAry2[4]);
		int sum = intAry[0] + intAry[1] + intAry[2] + intAry[3] + intAry[4];
		sum = 0; // sum초기화
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry2[i]); // 위에 5번써주는거랑 같음 for문 쓰면 for문안에 i가 인덱스
			sum += intAry2[i]; // 위에 sum 0+1+2+3+4랑 같음

		}
		int[] intAry3 = new int[10];
		for (int j = 0; j < 10; j++) {
			intAry3[j] = 5 * (j + 1);
		}
		for(int j=0; j<intAry3.length; j++) {  //length는 위에서 배열10칸 지정해준 만큼인거
		System.out.println(intAry3[j]);
		}
	}
}
