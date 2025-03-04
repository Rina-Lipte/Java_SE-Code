package day_16_12;

public class MultiThread extends Thread
{
	public static void main(String[] args) 
	{
		try
		{
			Thread t= new Thread(new MultiThread (),"Rahul");
			Thread t1= new Thread(new MultiThread(),"Ravi");
			t.start(); t1.start();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	public void run()
	{
		for(int i=0; i<2; i++)
		{
			try
			{
				Thread.sleep(1500);
			}
			catch (Exception e)
			{
				System.out.println("e2");
			}
			System.out.println(Thread.currentThread().getName()+" ");

		}
	}
}
