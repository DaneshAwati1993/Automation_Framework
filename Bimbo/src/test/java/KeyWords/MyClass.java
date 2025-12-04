package KeyWords;

public class MyClass {
	
	//static Variable
	static int counter=0;
	
	//Non-static variable
	int instanceNumber=0;
	
	//Default Constructor
	MyClass()
	{
		counter++;
		instanceNumber++;
	}
	
	//Static Method
	static void Displaycounter()
	{
		System.out.println(counter);
	}
	
	//Static Method
	void DisplayinstanceNumber()
	{
		System.out.println(instanceNumber);
	}	
	
	//Execution at JVM
	public static void main(String[] args) {

		MyClass mc1=new MyClass();
		
		Displaycounter();
		mc1.DisplayinstanceNumber();

		MyClass mc2=new MyClass();
		
		//Accessing static member
		Displaycounter();
		mc2.DisplayinstanceNumber();
	}

}
