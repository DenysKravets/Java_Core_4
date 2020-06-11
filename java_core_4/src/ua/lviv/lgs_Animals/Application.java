package ua.lviv.lgs_Animals;

public class Application 
{
	public static void main(String[] args) 
	{
		Animal animal1 = new Animal("Leopard", 20, 7);
		Animal animal2 = new Animal("bull", 2, 14);
		
		System.out.println("name="+animal1.getName()+", speed="+animal1.getSpeed()+", age="+animal1.getAge());
		System.out.println("name="+animal2.getName()+", speed="+animal2.getSpeed()+", age="+animal2.getAge());
		
		animal1.setName("Bold Eagle");
		animal1.setSpeed(36);
		animal1.setAge(4);
		animal2.setName("Goose");
		animal2.setSpeed(12);
		animal2.setAge(78);
		
		System.out.println("name="+animal1.getName()+", speed="+animal1.getSpeed()+", age="+animal1.getAge());
		System.out.println("name="+animal2.getName()+", speed="+animal2.getSpeed()+", age="+animal2.getAge());
	}
}
