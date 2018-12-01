package Chapter7Projects;

public class Task implements Complexity, Priority
{
	private String task;
	
	public Task(String task)
	{
		this.task = task;
	}

	@Override
	public void setPriority()
	{
		
	}

	@Override
	public int getPriority() 
	{
		return 0;
	}

	@Override
	public void setComplexity(int complexity)
	{
		
	}

	@Override
	public int getComplexity() 
	{
		return 0;
	}
	
	
}
