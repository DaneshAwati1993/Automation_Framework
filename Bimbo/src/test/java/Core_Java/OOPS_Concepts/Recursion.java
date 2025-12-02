package Core_Java.OOPS_Concepts;

public class Recursion {

	public static void main(String[] args) {
		
		int n=10;
		PrintNumbers(n);		//Calling statement
	}

	public static void PrintNumbers(int x)
	{
		if(x<1)
		return ;
		PrintNumbers(x-1);
		System.out.println(x);
	}
}
