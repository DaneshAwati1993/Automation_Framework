package Core_Java.OOPS_Concepts;

public class Methods {
	
	//1) No Input params and no Return type
	
	void message1()
	{
		System.out.println("No Input params and no Return Type");
	}

	//2) No Input params and has a Return type
	
	int message2()
	{
		int a2=11;
		a2++;
		return a2;
	}
	
	//3) Has Input params and no Return type
	
	void message3(String name)
	{
		System.out.println(name);
	}
	
	void message4(String name, int x)
	{
		System.out.println(name+ " "+x);
	}
	
	
	//4) Has Input params and has a Return type
	
	String message5(String firstname, String lastname)
	{
		return firstname+" "+lastname;
	}

}
