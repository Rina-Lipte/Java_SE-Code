package day_5_12;

public class IllegalStateExceptionDemo 
{
	static void throwIllegalException( ) 
	{ 
		try
		{ 
			throw new IllegalStateException("MyException"); 
		} 
		catch(IllegalStateException objA)
		{
			System.out.println("caught:" +objA); 
		}
	}
	
	public static void main(String[] args) 
	{
		throwIllegalException();

	}

}
