package ua.lviv.lgs_robot;

public class Application 
{
	public static void main(String[] args) 
	{
		Robot bot1 = new Robot();
		bot1.work();		
		CoffeeRobot bot2 = new CoffeeRobot();
		bot2.work();
		RobotDancer bot3 = new RobotDancer();
		bot3.work();
		RobotCooker bot4 = new RobotCooker();
		bot4.work();
	}
}
