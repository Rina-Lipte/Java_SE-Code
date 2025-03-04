package day_1_1_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayToList 
{
	public static ArrayList<String> convertToList(String[] inputArray)
	{
		ArrayList<String> al=null;
		if(inputArray==null || inputArray.length==0)
		{
			System.out.println("Error msg");
			return null;
		}
		else
		{
			return new ArrayList<>(Arrays.asList(inputArray)); 
		        
		}
		
		
	}
	
	

}
