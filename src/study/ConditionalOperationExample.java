package study;
//삼항연산자

public class ConditionalOperationExample
{
public static void main(String[] args)
{
	int score = 84;
	char grade = score>90 ? 'A' : score > 85? 'B' : score > 80? 'C' : 'D';
	System.out.println(score + "점수는" + grade + "등급입니다.");
}
}
