/*
 * Write a program to process a list of strings. Use a custom predicate to filter strings that start with a vowel and have a length greater than 5.
 */
package Feb6;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringStartwithA {

	public static void main(String[] args) 
	{
		Stream<String> str=Stream.of("aalex","rina","elina");
		
		/*
		 * List<String> collect = str.filter(st->(st.startsWith("a")&&
		 * st.length()>=5)||(st.startsWith("e")&& st.length()>=5)||(st.startsWith("i")&&
		 * st.length()>=5)||(st.startsWith("o")&& st.length()>=5)||(st.startsWith("u")&&
		 * st.length()>=5)).collect(Collectors.toList());
		 * 
		 * System.out.println(collect);
		 */

		Predicate<String> st=s->  "AEIOUaeiou".indexOf(s.charAt(0))!=-1&&s.length()>=5;
	
		
		str.filter(st).forEach(System.out::println);
	}

}
