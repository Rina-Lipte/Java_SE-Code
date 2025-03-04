/*
 * Given a list of strings, sort them by length first and lexicographically second. Implement this using sorted.
 */
package Feb6;

import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> l1 = List.of("alex","smith","alina","martin","adam");
		List<String> list = l1.stream().sorted().sorted((s1,s2)->s1.length()-s2.length()).toList();
		System.out.println(list);

	}

}
