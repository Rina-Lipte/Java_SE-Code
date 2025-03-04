package day_25_9;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Fahrenheit=Double.parseDouble(args[0]);
		double celsius=(Fahrenheit-32)*5/9;
		System.out.println("Fahrenheit To Celsius : "+celsius);

	}

}
