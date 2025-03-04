package day_11_12;

public class Product 
{
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void decreaseQuantity(int quantityProd) throws InsufficientQuantityException
	{
		
		if(this.quantity<quantityProd)
		{
			throw new InsufficientQuantityException("Product quantity not availavle");
		}
		else
		{
			this.quantity-=quantityProd;
		}
	}
	
	
	

}
