package day_11_12;

public class ShoppingCart 
{
	Product [] cartItems;
	int itemCount;
	
	public ShoppingCart(int capacity) 
	{
		super();
		cartItems=new Product[capacity];
	}
	
	public void addToCart(Product prod,int qnty) throws InsufficientQuantityException
	{
//		if(qnty>prod.quantity)
//		{
//			throw new InsufficientQuantityException("Required is not available.");
//		}
		 if(prod==null)
		{
			throw new InvalidProductException("Product not available");
		}
		else
		{
			while(qnty!=0)
			{
				cartItems[itemCount++]=prod;
				qnty--;
			}
			prod.decreaseQuantity(qnty);
		}
	}
	
	public double calculateTotal()
	{
		double total=0;
		
		for(Product product:cartItems)
		{
			if(product!=null)
			total+=product.price*product.quantity;
		}
		return total;
		
	}
	
	
	

}
