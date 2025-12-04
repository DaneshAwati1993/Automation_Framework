package ConstrictorOverLaoding;

public class Message {
	
	//Variable 
	
	String text;
	String FirstName;
	String LastName;
	
	//Method
	//Default Constructor no Inputs
	Message()
	{
		text="Hello";
		FirstName="";
		LastName="";
		
		System.out.println(text+" "+FirstName+" "+LastName);
		
	}
	
	//Parameterized Constructor with 1 Inputs
	Message(String fname)
	{
		text="Hello";
		FirstName=fname;
		LastName="";
		
		System.out.println(text+" "+FirstName+" "+LastName);
	}
	
	//Parameterized Constructor with 2 Inputs
	Message(String fname, String lname)
	{
		text="Hello";
		FirstName=fname;
		LastName=lname;
		
		System.out.println(text+" "+FirstName+" "+LastName);
			
	}


}
