package day_1_1_25;

import java.util.ArrayList;
import java.util.List;

public class Duplicates 
{
	 List<Integer> numberList;

	
	public Duplicates()
	{
		this.numberList = new ArrayList<>();
	}
	
	
	public Duplicates(List<Integer> numberList) {
		super();
		this.numberList = numberList;
	}


	public List<Integer> getNumberList() {
		return numberList;
	}


	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}
	
	public int getDuplicatesList()
	{
		if(numberList==null || numberList.isEmpty())
		{
			return 0;
		}
		return 0;
	}
	
	

}
