package day_21_11;

public class Egg extends Food
{

	int tastyScore=7;
	String type="Non-vegetarian";
	public Egg(double proteins,double fats,double carbs) 
	{
		super();
		this.carbs=carbs;
		this.fats=fats;
		this.proteins=proteins;
		
	}
	@Override
	void getMacroNutrients() {
		System.out.println("An egg has "+this.proteins+ " gms of protein, ["+this.fats+"] gms of fats and ["+this.carbs+"] gms of carbohydrates.");
		
	}
	
	

}
