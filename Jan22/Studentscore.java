package Jan22;

import java.util.Scanner;
import java.util.TreeMap;

public class Studentscore
{

	public static void main(String[] args) 
	{
		TreeMap<String,Integer> t1=new TreeMap<String,Integer>();
			Scanner sc=new Scanner(System.in);
			System.out.println(" How many Student record you want to add: ");
			int num=Integer.parseInt(sc.nextLine());
			while(num!=0)
			{
				System.out.println("Enter the name: ");
				String name=sc.nextLine();
			
				System.out.println("Enter the Score: ");
				int score=Integer.parseInt(sc.nextLine());
				t1.put(name, score);
				num--;
			}
			System.out.println("Student names and scores in sorted order:");
			t1.forEach((k,v)->System.out.println(k+" : "+v));
			
			
			
			
			

	}

}
