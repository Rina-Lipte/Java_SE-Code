package day_21_11;

import java.util.Scanner;

public class TestingFood {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice(1/2): ");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			Bread b=new Bread(4.0, 1.1, 13.8);
			System.out.println("Bread");
			System.out.println(b.type);
			b.getMacroNutrients();
			System.out.println("Taste:"+b.tastyScore);
			break;
		case 2:
			Egg e=new Egg(5.0,2.3,12.5);
			System.out.println("Egg");
			System.out.println(e.type);
			e.getMacroNutrients();
			System.out.println("Taste:"+e.tastyScore);
			break;
			default:System.out.println("Invalid Input.");
		}
		

	}

}
