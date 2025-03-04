package day_20_11;

public class StudentTester {

	public static void main(String[] args) {
		HistoryStudent hs=new HistoryStudent();
		hs.setHistoryMarks(80);
		hs.setCivicsMarks(90);
		System.out.println("History student Percentage: "+hs.getPercentage());
		ScienceStudent ss=new ScienceStudent();
		ss.setChemistryMarks(70);
		ss.setMathsMarks(90);
		ss.setPhysicsMarks(60);
		System.out.println("Science Student Percentage :"+ss.getPercentage());

	}

}
