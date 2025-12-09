package MethodOverRiding;

class Base
{
	void m1(String str)
	{
		System.out.println(str);
	}
	
	void m2(String s)
	{
		System.out.println(s);
	}
}

class SubClass extends Base
{
	void m1(String str)		//OverRide
	{
		System.out.println(str +" Child Display Method");
	}
	
	void m2(String str1, String str2)		//Overload
	{
		System.out.println(str1 + str2);
	}
}

public class OverLoadingVSOverRiding {

	public static void main(String[] args) {


		SubClass sb=new SubClass();
		sb.m1("Danesh");					//overriding
		sb.m2("D");							// method from parent class
		sb.m2("Danesh", "Awati");			//overloading
	}

}
