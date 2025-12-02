package Core_Java;

import Core_Java.OOPS_Concepts.Student;  //for class in anothr Package

public class StudentAnotherPackageMain {
	
	public static void main (String[] args)
	{
		
		Student student2=new Student();
		
		//assign values to variables 
		student2.name="Danesh";
		student2.address="Awati";
		student2.grade="A+";
		student2.rollnum=12;	
					
		//Call the method
		student2.DisplayDetails();
		student2.DisplayRollNum();
		
		
	}

}
