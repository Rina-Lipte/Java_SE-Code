package day_18_11;

public class PayPalPayment extends Payment{

	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment");
	}

}
