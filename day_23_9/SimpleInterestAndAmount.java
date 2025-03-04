package day_23_9;

public class SimpleInterestAndAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle=Integer.parseInt(args[0]);
		int rate=Integer.parseInt(args[1]);
		int time=Integer.parseInt(args[2]);
		int SI=(principle*rate*time)/100;
		System.out.println("Simple Interest = "+SI);
		System.out.println("Amount = "+(SI+principle));

	}

}
