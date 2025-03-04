package day_23_10Inheritance;

public class DayScholar extends Student
{
	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee)
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	
	public String displayDetails()
	{
		return "DayScholar [transportFee=" + transportFee + ", name=" + name + ", studentId=" + studentId + ", examFee="
				+ examFee + "]";
	}

	@Override
	public double payfee(double amount) {
		double totalFees = examFee+transportFee;
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
