package Java_Basics;

public class StaticAndNonStatic {
	
	String name="Danesh"; //non-static global variable
	static int age=32;	  //Static method global variable.	

	public static void main(String[] args) {


		//How to call static method and Variables.
		//1. Direct Calling
		sum();
		//2. using classname
		StaticAndNonStatic.sum();
		
		//How to call non-static method and Variables.
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.age);
		obj.sendmail();
	}

	public void sendmail()		//non-static main method
	{
		System.out.println("Send Mail method");
	}
	
	public static void sum()		//non-static main method
	{
		System.out.println("Sum Mail method");
	}
}
