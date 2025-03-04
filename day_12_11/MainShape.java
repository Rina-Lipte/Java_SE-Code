package day_12_11;

public class MainShape {

	public static void main(String[] args) {
		
		Cube c=new Cube();
		Cylinder cy=new Cylinder();
		Sphere s=new Sphere();
		
		System.out.println("Volume of cube :"+c.calculateVolume(3));
		System.out.println("Volume of the Cylinder :"+cy.calculateVolume(3,3));
		System.out.println("Volume of the Sphere :"+s.calculateVolume(3.14, 3));
	}

}
