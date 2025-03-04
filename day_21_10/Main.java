package day_21_10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test c1 = new Test(10, 15);
		Test c2 = new Test(c1);    
		Test c3 = c1;  
        System.out.println(c2);
	}

}
