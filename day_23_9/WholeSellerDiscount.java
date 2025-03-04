package day_23_9;

public class WholeSellerDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int netbill=Integer.parseInt(args[0]);
		if(netbill<5000)
		{
			int discount=netbill*5/100;
			System.out.println("5% Discount");
			System.out.println("Discount Amount= "+discount);
			System.out.println("Amount Payable= "+(netbill-discount));
		}
		else if(netbill>=5000 && netbill<10000)
		{
			int discount=netbill*10/100;
			System.out.println("10% Discount");
			System.out.println("Discount Amount= "+discount);
			System.out.println("Amount Payable= "+(netbill-discount));
			
		}
		else
		{
			int discount=netbill*15/100;
			System.out.println("15% Discount");
			System.out.println("Discount Amount= "+discount);
			System.out.println("Amount Payable= "+(netbill-discount));
		}

	}

}
