/*Define a method which returns the sum of three rounded numbers.
 If the right most digit of the number is less than 5, then round off 
 its value to the previous multiple of 10 otherwise if the right most 
 digit of the number is greater or equal to 5, and then round off to the
  next multiple of 10. 
Write the method with the following specifications: 
Name of the BLC class:RoundedSum
Name of method: sumOfRoundedValues() 
Access Modifier : public, static
Arguments: three argument of type integer
Return type: an integer value 
For example
If a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
Note:Don't use any control statements and looping statements

Create an ELC class Main to test the application
*/




package day_1_10;
import java.util.*;
public class SumOfThreeRoundedNumberELC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter the three number: " );
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int result=RoundedSum.sumOfRoundedValues(num1, num2, num3);
		System.out.println("Sum of Three Rounded number: "+result);

	}

}
