package day_2_10;

import java.text.*;
public class AreaOfCircleELC {

	public static void main(String[] args) {
		String areaOfCircle=Circle.getArea();
		double area=Double.parseDouble(areaOfCircle);
		DecimalFormat df=new DecimalFormat("00.00");
		System.out.println("The area of circle is: "+df.format(area));
		
		

	}

}
