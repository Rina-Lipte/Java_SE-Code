package day_6_1_25;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) 
	{
		StudentManagement stu1=new StudentManagement();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(true)
		{
		System.out.println("1.Add a Student");
		System.out.println("2. Remove a Student");
		System.out.println("3. Display Students");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");
		 choice=Integer.parseInt(sc.nextLine());
		
		switch (choice) {
		case 1: {
			System.out.println("Enter Student name: ");
			String name=sc.nextLine();
			stu1.addStudent(name);
			break;
			
		}
		case 2:
		{
			System.out.println("Enter Student name: ");
			String name=sc.nextLine();
			
			stu1.removeStudent(name);
			break;
		}
		case 3:
		{
			stu1.displayStudents();
			break;
		}
		case 4:
		{
			System.out.println("Exiting");
			return ;
		}
		}
		}
		
	}
}
