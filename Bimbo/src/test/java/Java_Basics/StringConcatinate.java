package Java_Basics;

public class StringConcatinate {
	
	public static void main (String[] args)
	{
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		double c=12.30;
		double d=13.75;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(c+d);

		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
		System.out.println("The value of a+b is : "+(a+b));


	}

}
