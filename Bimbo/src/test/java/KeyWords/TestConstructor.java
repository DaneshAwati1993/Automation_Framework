package KeyWords;

public class TestConstructor {
	
	TestConstructor()
	{
		System.out.println("Default Constructor....");
	}
	
	TestConstructor(String str)
	{
		this();
		System.out.println(str);
	}
	
	TestConstructor(String str, int x)
	{
		this("Testing");		//Default Constructors
		System.out.println(str+" "+x);
	}

	public static void main(String[] args) {

		TestConstructor tco3=new TestConstructor("Danesh",100);

	}

}
