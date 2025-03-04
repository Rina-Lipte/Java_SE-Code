package day_26_11;

import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		Consumer<Integer> value = (a) -> System.out.println(a*3);
		value.accept(5);
	}
}