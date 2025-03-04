package day_18_11;

public class MainPayment {

	public static void main(String[] args) {
		Payment p=new Payment();
		CreditCardPayment cp=new CreditCardPayment();
		PayPalPayment pp=new PayPalPayment();
		BankTransferPayment bp=new BankTransferPayment();
		
		System.out.println("Grneric Payment!");
		p.processPayment();
		
		System.out.println("Credit Card Payment");
		cp.processPayment();
		
		System.out.println("Processing multiple payment!");
		processMultiplePayments(p,cp,pp,bp);
		
	}
	public static void processMultiplePayments(Payment... payments)
	{
		for (Payment payment : payments) {
            payment.processPayment(); 
        }
	}

}
