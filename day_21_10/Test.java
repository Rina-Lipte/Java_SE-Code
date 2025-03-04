package day_21_10;

public class Test {
	private  double re,  im;
    public Test(double re, double im) {
        this.re = re;
        this.im = im;
    }
    Test(Test c) {
      System.out.println("Copy constructor called");
      re = c.re;
      im = c.im;
    }            
    public String toString() {
        return "(" + re + " + " + im + ")";
    } 
}
