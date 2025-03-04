package day_3_1_25;

import java.util.ArrayList;

public class CabCustomerService 
{
	private ArrayList<CabCustomer> list=new ArrayList<>();
	
	
	public void addCabCustomer(CabCustomer c)
	{
		list.add(c);
	}
	
	public boolean isFirstCustomer(CabCustomer c)
	{
		int customerCount=0;
		for(CabCustomer cust:list)
		{
			if(cust.getPhone().equals(c.getPhone()))
			{
				
				 customerCount++;
			}
		}
		
		return customerCount==1;
	}
	
	public double calculateBill(CabCustomer c)
	{
		if(isFirstCustomer(c))
		{
			return 0;
		}
		else if(c.getDistance()<=4)
		{
			return 80;
		}
		else 
		
		return 80+(c.getDistance()-4)*6;
	}
	
	public void printBill(CabCustomer c)
	{
		System.out.println(c.getCustomerName()+" please pay your bill of rs. "+calculateBill(c));
		
	}

}
