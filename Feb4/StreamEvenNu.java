package Feb4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEvenNu {

	public static void main(String[] args) 
	{
		/*Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> item =numbers.filter(num->(num%2!=0)).map(num->num*num).toList();
		System.out.println(item);*/
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		
		List<Integer> st=l1.stream().filter(num->(num%2!=0)).map(n->n*n).toList();
		System.out.println(st);
	}

}
