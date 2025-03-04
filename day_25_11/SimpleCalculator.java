package day_25_11;

public class SimpleCalculator implements Calculator {

	
	@Override
	public void calculateSum(int... num) 
	{
		int sum=0;
		for(int values:num)
		{
			sum=sum+values;
		}
		System.out.println("Sum of the number: "+sum);
		
	}

}
