package day_23_9;

public class SellingPriceOfCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int CostPrice=Integer.parseInt(args[0]);
		int repaires=250;
		int coloring=350;
		int accessories=500;
		int profit=1500;
		int SellingPrice=(CostPrice+repaires+coloring+accessories+profit);
		System.out.println("selling price of the cycle = "+SellingPrice);
		

	}

}
