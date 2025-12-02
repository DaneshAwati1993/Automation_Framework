package Core_Java.OOPS_Concepts;

public class Student {
	
	//Variables
	public int rollnum;
	public String grade;
	public String name;
	public String address;
	
	//Method 
	 public void DisplayDetails() {

		System.out.println(rollnum);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(address);
	}
	 
	 public void DisplayRollNum()
	 {
		 System.out.println("Roll Number Is : "+rollnum);
	 }
	/*
	 //Method -- Main actual execution will be starts here
	public static void main(String[] args) {
		
		//Create Object
		Student stu1= new Student();
		
		//assign values to variables 
		stu1.name="Danesh";
		stu1.address="Awati";
		stu1.grade="A+";
		stu1.rollnum=1;
		
		
		//Call the method
		stu1.DisplayDetails();
		stu1.DisplayRollNum();
		
		//Create Object
				Student stu2= new Student();
				
				//assign values to variables 
				stu2.name="Naveen";
				stu2.address="Awati";
				stu2.grade="A+";
				stu2.rollnum=2;
				
				
				//Call the method
				stu2.DisplayDetails();
				stu2.DisplayRollNum();
				
				//Create Object
				Student stu3= new Student();
				
				//assign values to variables 
				stu3.name="Pavan";
				stu3.address="Awati";
				stu3.grade="A+";
				stu3.rollnum=3;
				
				
				//Call the method
				stu3.DisplayDetails();
				stu3.DisplayRollNum();
				
		}
		*/


}
