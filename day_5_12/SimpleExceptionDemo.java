package day_5_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first integer (a): ");
			int a=sc.nextInt();
			System.out.println("Enter the second integer (b): ");
			int b=sc.nextInt();
			
			
		}
		catch(InputMismatchException obj)
		{
			System.out.println(obj.getMessage());
			obj.printStackTrace();
			System.out.println(obj.toString());
		}

	}

}
