package Jan30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamOfInt 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you want to store: ");
		int choice=sc.nextInt();
		System.out.println("Enter the "+choice+" Elements:");
		for(int i=1;i<=choice;i++)
		{
			al.add(sc.nextInt());
		}
		
		List<Integer> item=al.stream().filter(num->num%2==0).toList();
		System.out.println(item);
		
		
		
//		/* 1st way*/
//		Stream<Integer> strm=Stream.of(1,2,3,4,5,6);
//		//strm.filter(num->num%2==0).forEach(System.out::println);
//		
//		/*2nd way*/
//		List<Integer> item=strm.filter(num->num%2==0).toList();
//		System.out.println(item);
		
		
	}

}
