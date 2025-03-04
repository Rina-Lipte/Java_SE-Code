package day_17_10;

public class ELC {

	public static void main(String[] args) {
		int val=100;
		BLC c = new BLC("Ravi",2);
		m1(c);
		//GC
		System.out.println(c.getId());
		}
		public static void m1(BLC c)
		{
		c.setId(5);
		c = new BLC("Rahul",7);
		c.setId(9);
		System.out.println(c.getId());

	}

}
