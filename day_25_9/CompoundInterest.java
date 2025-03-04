package day_25_9;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);
		double amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("compound interest : "+amount);

	}

}
