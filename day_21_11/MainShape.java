package day_21_11;

public class MainShape {

	public static void main(String[] args) {
		Triangle t=new Triangle(146.2, 40.0);
		System.out.println("Type=Triangle\nBase=146.2\nHeight=40.0\nArea="+t.printDetails()+"\n");
		
		Rectangle r=new Rectangle(30.3, 45.4);
		System.out.println("Type=Rectangle\nLength=30.3\nBreadth=45.5\nArea="+r.printDetails()+"\n");
		
		Circle c=new Circle(23.2);
		System.out.println("Type=Circle\nRadius=23.2\nArea="+c.printDetails()+"\n");

	}

}
