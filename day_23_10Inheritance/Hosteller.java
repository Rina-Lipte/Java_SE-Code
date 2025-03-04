package day_23_10Inheritance;

public class Hosteller extends Student
{
	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) 
	{
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	
	public String displayDetails()
	{
		return "Hosteller [HostelFee=" + hostelFee + ", name=" + this.name + ", studentId=" + studentId + ", examFee="
				+ examFee + "]";
	}

	@Override
	public double payfee(double amount) {
		double totalFees = examFee+hostelFee;
		double  am=0;
		if(amount>totalFees)
		{
			am=totalFees-amount;
		}
		else if(amount==totalFees)
		{
			am=0;
		}
		else if(amount<totalFees)
		{
			am=totalFees-amount;
		}
		return am;
	}
	
	
}
