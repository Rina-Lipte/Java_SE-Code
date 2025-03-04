package day_15_10;

public class TaskMainELC {

	public static void main(String[] args) {
		TaskBLC t1=new TaskBLC("Finish Project","Complete documentation","High");
		t1.getTitle();
		t1.getDescription();
		t1.getPriority();
		System.out.println(t1);
		System.out.println(t1.isCompleted());
		
		
		t1=new TaskBLC("","Complete documentation","High");
		t1.getTitle();
		t1.getDescription();
		t1.getPriority();
		System.out.println(t1);
		
		t1=new TaskBLC("Finish Project","","High");
		t1.getTitle();
		t1.getDescription();
		t1.getPriority();
		System.out.println(t1);

}
}

