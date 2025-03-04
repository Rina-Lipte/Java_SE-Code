package day_14_11;

class Test {

	  String language;

	  Test() {
	    this.language = "Java";
	  }

	  Test(String language) {
	    this.language = language;
	  }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.language);
	  }

	  public static void main(String[] args) {

		  Test obj1 = new Test();

		  Test obj2 = new Test("Python");

	    obj1.getName();
	    obj2.getName();
	  }
	} 