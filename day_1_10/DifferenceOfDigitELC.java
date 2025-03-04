/*Define a method which returns the difference of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsDifference
Name of method: getDiffOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 83, 8 - 3 return 5.  If x = 38, 3 - 8 return -5.

Create an ELC class Main to test the application
*/


package day_1_10;

import java.util.*;
public class DifferenceOfDigitELC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num=sc.nextInt();
		
		int difference=TwoDigitsDifference.getDiffOfDigits(num);
		System.out.printf("The Differnce of two number is: "+difference);

	}

}
