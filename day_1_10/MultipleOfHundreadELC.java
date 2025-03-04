/*Define a method which returns the next multiple of 100 for the given number.
Write the method with the following specifications: 
Name of the BLC class:NextMultipleOfHundred
Name of method: getNextMultipleOfHundred()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 123, return 200.

Create an ELC class Main to test the application
*/



package day_1_10;
import java.util.*;
public class MultipleOfHundreadELC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int value=sc.nextInt();
		int result=NextMultipleOfHundred.getNextMultipleOfHundred(value);
		System.out.println("Next multiple of number "+value+" is: "+result);

	}

}
