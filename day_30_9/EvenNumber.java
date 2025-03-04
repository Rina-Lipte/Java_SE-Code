package day_30_9;

import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the starting range: ");
		int start=sc.nextInt();
		System.out.print("Enter the Ending range: ");
		int end=sc.nextInt();
		System.out.println("Even number from "+start+" to "+end+" is");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
