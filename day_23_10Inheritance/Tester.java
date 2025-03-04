package day_23_10Inheritance;

public class Tester {

	public static void main(String[] args)
	{
		DayScholar ds=new DayScholar(2,"Brian Lara", 25000, 5000);
		//System.out.println(ds);
		System.out.println(ds.displayDetails());
		
		
		Hosteller hs=new Hosteller(3, "Virat Kohli", 25000, 8000);
		System.out.println(hs.displayDetails());
		
		
		System.out.println("Remaining amount to pay(DayScholer): "+ds.payfee(38000));
		System.out.println("Remaining amount to pay(Hosteller): "+hs.payfee(43000));

	}

}
