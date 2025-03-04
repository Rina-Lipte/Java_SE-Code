package day_6_1_25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement 
{
	private Set<String> students=new HashSet<String>();
	//Scanner sc=new Scanner(System.in);
	public void addStudent(String name)
	{
			if(students.contains(name))
			{
				System.out.println("Student exists.");
			}
			else
			{
				students.add(name);
				System.out.println(students);
				System.out.println("Student added successfully.");
			}
		
	}
	public void removeStudent(String name)
	{
		if(students.remove(name))
		{
			System.out.println(students);
			System.out.println("Remove successfully.");
		}
		else
		{
			System.out.println("Student not found.");
		}
		
		
	}
	public void displayStudents()
	{
		if(students.isEmpty())
		{
			System.out.println("Student set is empty.");
		}
		else
		{
//			for (String string : students) {
//				System.out.println(string);
//			}
			System.out.println(students);
		}
		
	}
	
}	

	



