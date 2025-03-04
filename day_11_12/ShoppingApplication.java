package day_11_12;

public class ShoppingApplication {

	public static void main(String[] args) 
	{
	  ShoppingCart sc=new ShoppingCart(6);
	  Product p1=new Product(1, "TV", 30000, 7);
	  
	  try 
	  {
		sc.addToCart(p1, 8);
	} 
	  catch (InsufficientQuantityException e)
	  {
		
		System.out.println(e);
	}
	  
	  System.out.println("Total price: "+sc.calculateTotal());
	  

	}

}

//chikubiren99@gmail.com

