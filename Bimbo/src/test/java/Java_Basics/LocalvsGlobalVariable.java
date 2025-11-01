package Java_Basics;

public class LocalvsGlobalVariable {

	//Global variables;
	
	String name="Danesh";
	int age=32;
	
	
	public static void main(String[] args) {


		int i=10; //local variable within the main it has been used
		
		System.out.println(i);
		
		LocalvsGlobalVariable obj=new LocalvsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void sum()
	{
		int i=15;			//Local variables for the Sum method
		int j=20;
	}

}
