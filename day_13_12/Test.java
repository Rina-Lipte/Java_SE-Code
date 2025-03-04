package day_13_12;

public class Test 
{
public static void main(String[] args) 
{
 new Test().go();
 }

 public void go() 
 {
 Runnable r = new Runnable()
 {
 public void run() 
 {
 System.out.println("foo");
 }};
  Thread t = new Thread(r);
  t.start();
  t.run();
 }
 }
