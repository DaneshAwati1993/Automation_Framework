package KeyWords;

class car
{
	car()
	{
		System.out.println("car Default Constroctore");
		}
	int speed=100;
	void accelerate()
	{
		System.out.println("Accelerate method in the Parent Class");
	}
}

class BMW extends car
{
	BMW()
	{
		super();
		System.out.println("BMW Default Constroctore");
	}
	int speed=150;			//Overridden Variable
	void displaySpeed()
	{
		System.out.println(speed);		//ChildClass
		System.out.println(super.speed);	//Immidiate Parent

	}
	
	void accelerate()
	{
		System.out.println("Accelerate method in the Child Class");
		super.accelerate();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		BMW bmw =new BMW();
		
		bmw.displaySpeed();
		
		bmw.accelerate();
		
		
	}

}
