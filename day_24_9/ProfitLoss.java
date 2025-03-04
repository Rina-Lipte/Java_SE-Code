package day_24_9;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SellingPrice=Double.parseDouble(args[0]);
		double CostPrice=Double.parseDouble(args[1]);
		if(SellingPrice>=CostPrice)
		{
			double Profit=SellingPrice-CostPrice;
			double ProfitPer=(Profit/CostPrice)*100;
			System.out.println("Profit= "+Profit);
			System.out.println("Profit Percentage= "+ProfitPer);
		}
		else {
		double Loss=CostPrice-SellingPrice;
		double LossPer=(Loss/CostPrice)*100;
		System.out.println("Loss= "+Loss);
		System.out.println("Loss Percentage= "+LossPer);
		}

	}

}
