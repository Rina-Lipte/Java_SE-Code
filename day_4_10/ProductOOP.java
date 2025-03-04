package day_4_10;
//import java.util.*;
public class ProductOOP {
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData(String pName,int pId,double pPrice)
	{
		productId=pId;
		productName=pName;
		productPrice=pPrice;
		
	    /*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product name: ");
		productName=sc.next();
		System.out.println("Enter the product id: ");
		productId=sc.nextInt();
		System.out.println("Enter the price of the product: ");
		productPrice=sc.nextDouble();*/
		
		
	}
	public void getProductInfo(String pName,int pId,double pPrice)
	{
		System.out.println("Product Name: "+productName);
		System.out.println("Product Id: "+productId);
		System.out.println("Product price :"+productPrice);
	}

	
}
