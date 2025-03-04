package day_20_11;

public class HistoryStudent extends Student
{
	private int historyMarks;
	private int civicsMarks;
	@Override
	public int getPercentage() {
		
		return (historyMarks+civicsMarks)/2;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	
	

}
