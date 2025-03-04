package day_15_10;

public class TaskBLC 
  {
	
	private String title;
	private String description;
	private String priority;
	private boolean completed;
	
	
	public TaskBLC(String title, String description, String priority) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed=false;
	}
	
	public void updateDescription(String newDescription)
	{
		this.description=newDescription;
	}
	
	public void updatePriority(String newPriority)
	{
		this.priority=newPriority;
	}
	
	public void markAsCompleted()
	{
		this.completed=true;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getPriority()
	{
		return priority;
	}
	
	public boolean isCompleted()
	{
		return completed;
	}

	@Override
	public String toString() {
		if(title.isEmpty())
		{
			return "Error message indicating invalid title";
		}
		else if(description.isEmpty())
		{
			return "Error message indicating invalid description";
		}
		else
		{
		return "TaskBLC [title=" + title + ", description=" + description + ", priority=" + priority + ", completed="
				+ completed + "]";
		}
	}
	

}
