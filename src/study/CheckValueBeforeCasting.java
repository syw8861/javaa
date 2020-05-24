package study;
//변환으로 인한 데이터 손실 체크 int값 128은 byte의 범위보다 훨씬 크기때문에 변환하면 데이터 손실이 발생한다.
public class CheckValueBeforeCasting
{
	public static void main(String[] args)
	{
		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE))
		{
			System.out.println("byte타입으로 변환 할 수 없습니다.");
			System.out.println("값을 확인하세요");
		}
		else
		{
			byte b =(byte)i;
			System.out.println(b);
		}

	}
}
