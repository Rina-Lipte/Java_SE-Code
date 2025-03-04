package day_3_12;

import java.util.function.Consumer;

public class ValueModifier 
{

	public static void main(String[] args) 
	{
		Consumer<String> stringConsumer=(str)->
		{
			System.out.println("After converting string to uppercase: "+str.toUpperCase());
		};
		Consumer<Integer> integerConsumer=(num)->
		{
			System.out.println("After squaring the integer: "+(num*num));
		};
		
		stringConsumer.accept("world");
		integerConsumer.accept(5);
	}

}
