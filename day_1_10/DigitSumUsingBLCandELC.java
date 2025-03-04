/*Define a method which returns the sum of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsSum
Name of method: getSumOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 34, return 7

Create an ELC class Main to test the application
*/

package day_1_10;
import java.util.*;
public class DigitSumUsingBLCandELC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=sc.nextInt();
		int result=TwoDigitsSum.getSumOfDigits(num);
		System.out.println("The addition of two number is: "+result);
		

	}

}
