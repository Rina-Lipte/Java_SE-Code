package day_1_10;

public class TwoDigitsDifference {
	
	public static int getDiffOfDigits(int num)
	{
		int num1=num%10;
		num=num/10;
		return num-num1;
	}

}
