package day_12_12;

	
public class MultithreadTest extends Thread
{
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getId()+" ");
		Thread t1 = new Thread(new MultithreadTest(),"Rahul");
		Thread t2 = new Thread(new MultithreadTest(),"Ravi");
		Thread t3 = new Thread(new MultithreadTest(),"Puja");
		t3.start();
		t1.start();
		t2.run();
		t2.start();
	}
	public  void run()
	{
		    for(int i=0; i<2; i++)
			System.out.println(Thread.currentThread().getName()+" I'm :"+i);
			System.out.println("It is end of loop");
	}
}