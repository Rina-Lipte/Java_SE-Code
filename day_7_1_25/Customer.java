package day_7_1_25;

import java.util.Comparator;

public class Customer implements Comparator<Customer>
{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	
	
	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.customerNumber.compareTo(c2.customerNumber);
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
	
	

}
