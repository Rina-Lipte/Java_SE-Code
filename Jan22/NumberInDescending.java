package Jan22;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NumberInDescending {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>(Collections.reverseOrder());
		tm.put(10, "Ten");
		tm.put(5, "Five");
		tm.put(20, "Twenty");
		tm.put(1, "One");
		tm.put(15, "Fifteen");
		
//		NavigableSet<Integer> dec=tm.descendingKeySet();
//		System.out.println("Keys in descending order:");
//		System.out.println(dec);
		
		System.out.println("Keys in descending order:");
		tm.forEach((k,v)->System.out.println(k));

	}

}
