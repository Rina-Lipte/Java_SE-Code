package day_25_9;

public class SurfaceAreaOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=Double.parseDouble(args[0]);
		double height=Double.parseDouble(args[1]);
		final double pi=3.14;
		double surfaceArea=(2*pi*radius*radius)*(2*pi*radius*height);
        System.out.println("The total surface area of a cylinder : "+surfaceArea);
	}

}
