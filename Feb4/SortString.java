package Feb4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortString 
{
	public static void main(String[] args) 
	{
		List<String> str=Arrays.asList("apple","banana","orange", "grape", "pear");
		List<String> st=str.stream().sorted((x,y)->y.compareTo(x)).toList();
		System.out.println(st);

	}
}
