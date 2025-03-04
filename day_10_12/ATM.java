package day_10_12;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount(1233325446, 1000);
		Customer cust= new Customer("xyz", b);
		
		try(sc)
		{
			
			int choice;
			while(true)
			{
				System.out.println("Select an option");
				System.out.println("1. Deposit");
				System.out.println("2. Withdrow");
				System.out.println("3. Transfer");
				System.out.println("4. Loan Aplication");
				System.out.println("5. Check Balance");
				System.out.println("6. Exit");
				System.out.print("Enter your choice: ");
				choice=sc.nextInt();
				
				
				
				switch(choice)
				{
				case 1: 
					cust.getAccount().deposit(1000);
					break;
				case 2:
					cust.getAccount().withdraw(500);
					break;
				case 3:
					//cust.getAccount().transfer(null, 1000);
					cust.getAccount().transfer(b, 1000);
					break;
				case 4:
					cust.getAccount().applyForLoan(30000);
					break;
				case 5:
					System.out.println(cust.getAccount().getBalance());
					
					break;
				case 6:
					System.out.println("Exiting...........");
					return;
				default:
					System.out.println("Enter choice is wrong.");
				}
			}
		} 
		catch ( InsufficientFundsException | AccountNotFoundException | InvalidAmountException | LoanNotAllowedException e) {
			
			System.out.println(e);
		}
		
		

	}

}
