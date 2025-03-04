package day_25_11;

public class CalculatorTest {

	public static void main(String[] args) 
	{
		SimpleCalculator sc=new SimpleCalculator();
		sc.calculateSum(1,2,3);
		sc.calculateSum(10,20,30,40);
		sc.calculateSum(5);
		sc.calculateSum();
		
	}

}
