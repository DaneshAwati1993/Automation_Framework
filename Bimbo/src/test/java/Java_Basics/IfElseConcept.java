package Java_Basics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a=-30;
		int b=20;
		
		if (a>b)
		{
			System.out.println("a is Greater than b");
		}
		else
		{
			System.out.println("b is Greater than a");

		}
		
		
		//Comparision Operators : 
		
		// < > <= >= == !=
		
		int c=100;
		int d=200;
		
		if(c==d)
		{
			System.out.println("c & d are equal");
		}
		else
		{
			System.out.println("c & d are not equal");
		}
		
		if(c>d)
		{
			System.out.println("c is greater than d");
		}
		else
		{
			System.out.println("d is greater than c");
		}
		
		
		//Write a logic to find out the highest number 
		
		double a1=101.5;
		int b1=99; 
		int c1=101;
		
		//using nested if else conditions;
		
		if(a1>b1 & a1>c1)
		{
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1)
		{
			System.out.println("b1 is the greatest");
		}
		else
		{
			System.out.println("c1 is the greatest");
		}
		
	}

}
