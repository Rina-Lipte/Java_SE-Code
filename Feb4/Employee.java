package Feb4;

import java.util.List;

public class Employee 
{
	public Employee(String string, int i, int j) {
		
	}

	public static void main(String[] args) 
	{
		List<Object> li=List.of(new Employee("John",50000,6),
				new Employee("Jane", 45000, 4),
				new Employee("Tom", 60000, 7),
				new Employee("Lucy", 52000, 5),
				new Employee("Anna", 48000, 8));
		
		//li.stream().filter(sal-).forEach(System.out::println);

	}
}
