package Feb4;

import java.util.Arrays;
import java.util.List;

public class FlatteningList 
{
	public static void main(String[] args) 
	{
List<Integer> l1 = List.of(1,2,3);
List<Integer> l2 = List.of(2,3,4,5);
List<Integer> l3 = List.of(4,5,6);

List<List<Integer>> list = List.of(l1,l2,l3);
list.stream().flatMap(x->x.stream()).distinct().forEach(System.out::println);
	}
}
