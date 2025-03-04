package day_20_9;

public class CalculateTaxForTaxableIncome {

	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		double tax=(amount*4.9/100);
		System.out.println("Tax :"+tax);

	}

}
