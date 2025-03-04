package day_13_11;

public class Main {
	public static void main(String[] args){
		
		Sub s1 = new Sub(); s1.access(30);
		}
}
		
class Super
{
	public void access(long x)
	{
	  System.out.println("Widening");	
	}
}
class Sub extends Super
{	
	public void access(Integer x)
	{
	  System.out.println("Autoboxing");	
	}
	
}