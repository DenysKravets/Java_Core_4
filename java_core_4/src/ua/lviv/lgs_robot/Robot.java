package ua.lviv.lgs_robot;

public class Robot {
	
	private String activity;
	
	Robot()
	{
		this.activity = "work";
	}
	
	Robot(String activity)
	{
		this.activity = activity;
	}
	
	public void work()
	{
		System.out.println("I just " + activity);
	}
	
}
