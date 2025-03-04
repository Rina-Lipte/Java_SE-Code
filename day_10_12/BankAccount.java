package day_10_12;

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	
	@Override
	public void deposit(double amount) throws InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount Should be More than zero");
		}
		
			balance=balance+amount;
			System.out.println("Balance should increase by "+balance);
			
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException 
	{
		if(amount>balance)
		{
			throw new InsufficientFundsException("Insufficient funds in the account.");
		}
		if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount, amount should be greater than zero.");
		}
		
			balance=balance-amount;
			System.out.println("Balance should decrease by "+balance);
		
		
		
	}
	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		if(amount>balance)
		{
			throw new InsufficientFundsException("Insufficient Funds to transfer.");
		}
		 if(toAccount == null)
		{
			throw new AccountNotFoundException("Account Not Found.");
		}
		 if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount to transfer.");
		}
		
			balance=balance-amount;
			toAccount.balance+=amount;
			//toAccount.deposit(amount);
			System.out.println("Sender's balance should decrease by"+amount+", receiver's balance should increase by "+amount);
				
		
		
		
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException 
	{
		int limit=50000;
		if(limit<amount)
		{
			throw new LoanNotAllowedException("Loan Not Allowed.");
		}
		if(amount<=0)
		{
			throw  new InvalidAmountException("Invalid Amount.");
		}
		balance=balance+amount;
			System.out.println("Loan should be approved, balance should increase by "+amount);
			
		
		
		
	}
	@Override
	public double getBalance() 
	{
		
		return balance;
		
	}
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	

}
