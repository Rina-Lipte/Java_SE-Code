package day_7_1_25;

import java.util.*;

public class MainCustomer {

	public static void main(String[] args) {
		ArrayList<Customer> cust=new ArrayList<Customer>();
		
		cust.add(new Customer(101, "zartin",  2000.8));
		cust.add(new Customer(102, "scott", 3400.7));
		cust.add(new Customer(100,"adam",1000.6));
		
		System.out.println("Before Sorting:");
        cust.forEach(System.out::println);

        
        System.out.println("\nSorting the Data based on customer name :");		
		Collections.sort(cust,(c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
        System.out.println("After Sorting based on customer Name:");
        cust.forEach(System.out::println);
        
        System.out.println("\nSorting the Data based on customer number :");		
		Collections.sort(cust,(c1,c2)->c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
        System.out.println("After Sorting based on customer number:");
        cust.forEach(System.out::println);
        
        System.out.println("\nSorting the based on customer bill :");		
		Collections.sort(cust,(c1,c2)->c1.getCustomerBill().compareTo(c2.getCustomerBill()));
        System.out.println("After Sorting based on customer bill:");
        cust.forEach(System.out::println);
		
		

	}

}
