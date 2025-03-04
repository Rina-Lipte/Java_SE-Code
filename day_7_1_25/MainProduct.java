package day_7_1_25;

import java.util.ArrayList;
import java.util.Collections;

public class MainProduct {

	public static void main(String[] args) {
		ArrayList<Product> prod=new ArrayList<>();
		
		prod.add(new Product(101, "Laptop", 75000.0));
        prod.add(new Product(102, "Smartphone", 25000.0));
        prod.add(new Product(103, "Tablet", 30000.0));
        prod.add(new Product(104, "Headphones", 1500.0));

        System.out.println("Before Sorting:");
        prod.forEach(System.out::println);

        
        Collections.sort(prod);

        System.out.println("\nAfter Sorting by Product Name:");
        prod.forEach(System.out::println);

	}

}
