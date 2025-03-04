package day_21_9;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double fahrenheit=Double.parseDouble(args[0]);
		double celsius=((fahrenheit-32)*5)/9;
		System.out.println("Convertion of fahrenheit to celsius is="+celsius);

	}

}
