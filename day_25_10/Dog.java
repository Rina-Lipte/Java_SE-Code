package day_25_10;

public class Dog extends Mammal
{
	private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("Breed :"+breed);
	}
	
	
	
	

}
