package day_15_11;

public class MainShape {

	public static void main(String[] args) {
		Cube c=new Cube();
		System.out.println("Volume of the Cube:"+c.calculateVolume(3));

		Cylinder cy=new Cylinder();
		System.out.println("Volume of the Cylinder:"+cy.calculateVolume(2.0, 2.0));
		
		Sphere s=new Sphere();
		System.out.println("Volume of the Sphere: "+s.calculateVolume((float) 3.14, 3));
	}

}
