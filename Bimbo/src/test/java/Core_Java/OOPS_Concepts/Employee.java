package Core_Java.OOPS_Concepts;

public class Employee {
	
	//Variables
	
	int empId;
	String empname;
	double salary;
	
	//User defined method
	void printemployeedata()
	{
		System.out.println(empId +"  "+empname+"  "+salary);

	}
	
	Employee()
	{
		System.out.println("Default Constuctors");
		empId=500;
		empname="Danesh121";
		salary=51500.87;
	}
	void setemployeeData(int Id, String name, double sal)
	{
		empId=Id;
		empname=name;
		salary=sal;
	}

	public static void main(String[] args) {

		Employee emp1=new Employee();
		
		//Approach 1 : Define some values to variable
		emp1.empId=101;
		emp1.empname="Danesh";
		emp1.salary=25000.00;
		
		emp1.printemployeedata();
		
		//Approach 2 : Define  values using another method
		
		emp1.setemployeeData(15, "Danesh1", 123456.78);
		emp1.printemployeedata();
		
		//Approach 3 : Using constructor
		
		Employee emp3=new Employee();
		emp3.printemployeedata();
		


	}

}
