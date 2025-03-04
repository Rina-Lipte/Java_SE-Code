package day_21_9;

public class SalaryOfPerson {

	public static void main(String[] args) {
		int BasicSalary=Integer.parseInt(args[0]);
		float HRA=BasicSalary*15/100;
		float conveyanceallowance=BasicSalary*15/100;
		float Entertainmentallowance=BasicSalary*10/100;
		System.out.println("Total Salary="+(BasicSalary+HRA+conveyanceallowance+Entertainmentallowance));
	}

}
