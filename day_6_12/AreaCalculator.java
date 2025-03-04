package day_6_12;

import java.util.Scanner;

public class AreaCalculator
{
	public static double calculateArea(double l,double w) throws IllegalArgumentException
	{
		try {
			if(l<0||w<0)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException caught: Dimensions must be positive: length="+l+", width="+w);
			System.exit(0);
		}
		return l*w;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		int l=sc.nextInt();
		System.out.println("Enter width of rectangle: ");
		int w=sc.nextInt();
		
		System.out.println("Area of rectangle with length 5 and width 4 is: "+calculateArea(l, w));
				
				
		

	}

}
