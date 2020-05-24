package study;

//연산식에서 자동 변수타입 변환
public class OperationsPromotionExample
{
	public static void main(String[] args)
	{
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 10;
//		char charValue3 = charValue1 + chaValue2; // 캐릭터+캐릭터 타입 = 캐릭터 타입 x
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0; 인트타입10에 더블타입 4.0을 나눌순 없다.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
	}
}
