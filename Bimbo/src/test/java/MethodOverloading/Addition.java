package MethodOverloading;

public class Addition {
	
	//Variable
	int a, b ;
	
	//Method 
	//Case 1 : No Inputs 
	void sum()
	{
		a=100;
		b=200;
		System.out.println(a+b);
	}

	//Case 2 : 2 Inputs 
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	//case 3 : 2 Inputs different data type
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	
	//case 4 : 2 Inputs different data type with different position
	void sum(double x, int y)
	{
		System.out.println(x+y);
	}
	
	//Case 5 : 3 Inputs 
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
}
