package day_20_9;

public class SumAndAvgOf3NuUsingCmd {

	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int size=args.length;
		System.out.println("Sum of Three number is :"+(num1+num2+num3));
		System.out.println("Average of three number is:"+(num1+num2+num3)/size);
	}

}
