package day_3_1_25;

public class CabCustomerServiceTester {

	public static void main(String[] args) 
	{
		CabCustomer c1=new CabCustomer(101, "King", "ameerpet", "nampaly", 4, "9876545578");
		CabCustomer c2=new CabCustomer(101, "John", "ameerpet", "nampaly", 4, "9876545678");
		CabCustomer c3=new CabCustomer(102, "Smith", "begampet", "hyd", 10, "9876545678");
		CabCustomerService cust1=new CabCustomerService();
		cust1.addCabCustomer(c1);
		cust1.addCabCustomer(c2);
		cust1.addCabCustomer(c3);
		
		cust1.printBill(c1);
		cust1.printBill(c2);
		cust1.printBill(c3);
	}

}
