package day_21_11;

public class Bread extends Food
{
	int tastyScore=8;
	String type="vegetarian";
	
	public Bread(double proteins,double fats,double carbs) 
	{
		super();
		this.carbs=carbs;
		this.fats=fats;
		this.proteins=proteins;
		
	}

	@Override
	void getMacroNutrients() {
		System.out.println("A slice of bread has ["+this.proteins+"] gms of protein, ["+this.fats+"] gms of fats and ["+this.carbs+"] gms of carbohydrates.");
		
	}
	
	
	

}
