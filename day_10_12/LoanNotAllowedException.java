package day_10_12;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends RuntimeException
{
	public LoanNotAllowedException(String msg)
	{
		super(msg);
	}

}
