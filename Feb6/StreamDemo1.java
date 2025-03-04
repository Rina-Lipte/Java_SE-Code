/*
 * Use Stream.iterate or Stream.generate to create an infinite stream. Then filter and map the data to produce the first 10 odd squares.
 */
package Feb6;

import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		 Stream<Integer> ite = Stream.iterate(1, n->n+1).filter(n->n%2==1).map(n->n*n).limit(10);
		ite.forEach(System.out::println);

	   }

}
