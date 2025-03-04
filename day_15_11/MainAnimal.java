package day_15_11;

public class MainAnimal {

	public static void main(String[] args) {
		Animal a=new Animal();
		if(a instanceof Animal)
		{
			a.makeSound();
		}
		Dog d=new Dog();
		if(d instanceof Dog)
		{
			d.makeSound();
		}

	}

}
