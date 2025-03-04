package day_5_12;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{
	public static void handleExceptions(String str)
	{
		try 
		{
			System.out.println("Length of the input string: "+str.length());
			int len=Integer.parseInt(str);
			System.out.println("Length of the String: "+len);
						
		}
		catch(NullPointerException | NumberFormatException e)
		{
			if(e instanceof NumberFormatException)
			{
				System.out.println("Invalid input, not a number.");
				//System.out.println(e.getMessage());
				e.printStackTrace();
				//System.out.println(e.toString());
			}
			else if(e instanceof NullPointerException)
			{
				System.out.println("Attempted to operate on a null object.");
				//System.out.println(e.getMessage());
				e.printStackTrace();
				//System.out.println(e.toString());
			}
			else
			{
				System.out.println("Generic");
			}
			
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		//String str=sc.nextLine();
		handleExceptions(null);
		sc.close();
		
		

	}

}
