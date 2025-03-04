package day_1_1_25;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject {

	public static void main(String[] args) throws IOException 
	{
		ArrayList<Student> al=new ArrayList<>();
		var fos=new FileOutputStream("C:\\JavaNareshaIT\\new\\Student.txt");
		var oos=new ObjectOutputStream(fos);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many objects u want to create:");
		int n = sc.nextInt();
		
			try(fos;oos)
			{
				for(int i=0;i<n;i++)
				{
					Student s = Student.getStudentObject();
					al.add(s);					
				}
				oos.writeObject(al);
				
			}
		
		
		
		

	}

}
