package day_26_11;

//@FunctionalInterface
interface NIT
{	
	int myInterface(int a);
}

//@FunctionalInterface
interface NewInterface
{
	void alpha(String a);
}

public class FunctionalInterface {
	public static void main(String[] args) {
		NIT nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}