package day_23_9;

public class NuYearMonthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nuDays=Integer.parseInt(args[0]);
		int year=nuDays/365;
		int n=nuDays%365;
		int month=n/30;
		n=n%30;
		int day=n%30;
		System.out.println(" There are " + year + " Year " + month + " Month " + day + " Days");
		

	}

}
