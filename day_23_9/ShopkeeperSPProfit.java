package day_23_9;

public class ShopkeeperSPProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=Integer.parseInt(args[0]);
		double profit=amount*27/100;
		double VAT=amount*12.7/100;
		double ServiceCharge=amount*3.87/100;
		double SellingPrice=amount+profit+VAT+ServiceCharge;
		System.out.println("Total Selling Price="+SellingPrice);
		System.out.println("Profit="+(SellingPrice-amount));

	}

}
