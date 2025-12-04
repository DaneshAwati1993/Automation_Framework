package ConstrictorOverLaoding;

public class OverloadingMainMethod {
	
	//No Input
	void main()
	{
		System.out.println("No Inputs");
	}
	
	//1 input
	void main(String str)
	{
		System.out.println("String : "+str);
	}
	
	//2 data input
	void main(int x, int y)
	{
		System.out.println("Sum of "+x+" & "+y+ " is : "+(x+y));
	}

	
	//Execution STarting Point
	public static void main(String[] args) {

		OverloadingMainMethod main=new OverloadingMainMethod();
		
		main.main();
		main.main("Danesh");
		main.main(100, 150);
	}

}
