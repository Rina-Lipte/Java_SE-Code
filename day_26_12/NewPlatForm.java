package day_26_12;
class MyThread extends Thread {
	   public static Thread mt;

	   public void run() {
	      try {
	         mt.join();
	      } catch(InterruptedException ie) {}
	      System.out.print("Child ");
	   }
	}

	public class NewPlatForm {
	   public static void main(String[] args) 
	                 throws InterruptedException {
	      MyThread.mt = Thread.currentThread();
	      MyThread t = new MyThread();
	      t.start();
	      Thread.sleep(1000);
	      System.out.print("Main ");
	   }
	}