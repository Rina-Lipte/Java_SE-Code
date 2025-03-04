package day_4_10;
import java.util.*;
public class ELCProduct {

	public static void main(String[] args) {
		ProductOOP po =new ProductOOP();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product name: ");
		String pName=sc.next();
		System.out.println("Enter the product id: ");
		int pId=sc.nextInt();
		System.out.println("Enter the price of the product: ");
		double pPrice=sc.nextDouble();
		po.setProductData(pName,pId,pPrice);
		po.getProductInfo(pName,pId,pPrice);

	}

}
