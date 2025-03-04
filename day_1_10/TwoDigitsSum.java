package day_1_10;

public class TwoDigitsSum {

	public static int  getSumOfDigits(int num) {
		int num1=num%10;
		num=num/10;
		return num1+num;
		

	}

}
