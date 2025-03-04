package day_24_10_prog2;

public class Test {

	public static void main(String[] args) {
		System.out.println("Science Student Details:");
		ScienceStudent ss=new ScienceStudent("rina", -23, 79, 89, 99);
		ss.displayDetails();
		ss.calculatePercentage();
		
		System.out.println("\nArts Student Details:");
		ArtsStudent as=new ArtsStudent("Sheru", 22, 67, 78, 88);
		as.displayDetails();
		as.calculatePercentage();
	}

}
