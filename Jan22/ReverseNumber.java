package Jan22;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(10, "Ten");
		tm.put(5, "Five");
		tm.put(20, "Twenty");
		tm.put(1, "One");
		tm.put(15, "Fifteen");
		
		
	
//		System.out.println("Number in Reverse order: ");
//		tm.forEach((k,v)->System.out.println(k+" : "+v));
//	
		tm.put(-1, "Minus One");
		tm.put(-5, "Minus Five");
		tm.put(0, "Zero");
		tm.put(-10, "Minus Ten");
		tm.put(5, "Five");
		NavigableMap<Integer, String> descendingMap = tm.descendingMap();
		System.out.println(descendingMap);
	
	}

}
