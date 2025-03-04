package day_6_12;

import java.util.Scanner;

public class DivisionExample 
{
	public static int performDivision(int x,int y) throws ArithmeticException
	{
		return (x/y);
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter divident: ");
		int x=sc.nextInt();
		System.out.print("Enter divisor: ");
		int y=sc.nextInt();
		
		try
		{
			System.out.println("Result of Division: "+performDivision(x, y));
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e.toString());
		}
		

	}

}
