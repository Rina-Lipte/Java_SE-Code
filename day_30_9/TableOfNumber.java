package day_30_9;

import java.util.*;
public class TableOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digit: ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
