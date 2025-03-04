package Jan30;

import java.util.stream.Stream;

public class StringConcatStreamOf 
{
	public static void main(String[] args) 
	{
		Stream<String> strm=Stream.of("Hello","","World"," ","From"," ","Java","!");
		//strm.forEach(System.out::print);
		
		strm.filter(str->!(str.isEmpty())).forEach(System.out::print);

	}
}
