package day_2_12;

import java.util.function.*;

public class Java8 {
	public static void main(String[] args) {
		Consumer<Integer> msg=( a) -> System.out.println("NareshIT" + (a+1));
		
		msg.accept(5);
	}
} 

