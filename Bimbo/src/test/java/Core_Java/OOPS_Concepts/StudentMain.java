package Core_Java.OOPS_Concepts;

public class StudentMain 
{
	
	//Method -- Main actual execution will be starts here
	public static void main(String[] args) 
	{

		//Create Object
		Student student1= new Student();
				
		//assign values to variables 
		student1.name="Danesh";
		student1.address="Awati";
		student1.grade="A+";
		student1.rollnum=1;	
				
		//Call the method
		student1.DisplayDetails();
		student1.DisplayRollNum();
	}

}