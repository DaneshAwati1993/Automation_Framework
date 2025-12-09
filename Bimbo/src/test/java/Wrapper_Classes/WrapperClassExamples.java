package Wrapper_Classes;

public class WrapperClassExamples {

	public static void main(String[] args) {

		//Case 1 : Convert String to Other Data Type
		
		//String str="Danesh";		---> Invalid Input
		String str="12345";
		int x=Integer.parseInt(str);
		System.out.println(x);
		
		String d1="555.345";
		String d2="222.555";
		double y1=Double.parseDouble(d1);
		double y2=Double.parseDouble(d2);
		System.out.println(y1+y2);
		
		
		//String to boolean
		//Return false in all cases except true;
		
		String s="true";
		boolean b1=Boolean.parseBoolean(s);
		System.out.println(b1);
		
		
		//Case 2 : Convert Other Data Type to String
		
		int a=100;
		double d=111.234;
		char c='A';
		boolean b=true;
		
		String s1=String.valueOf(a);
		String s2=String.valueOf(d);
		String s3=String.valueOf(c);
		String s4=String.valueOf(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		Integer a1=100;
		String s5=Integer.toString(a1);
		System.out.println(s5);

		Double d3=111.456;
		String s6=Double.toString(d3);
		System.out.println(s6);
		
		//----------------------------------------------------
		
		int a11=500;		//Primitive Value
		Integer x11=500;	//Autoboxing
		Integer x12=a11;
		
		Integer x13=435;		
		int a12=x13;		//Auto Unboxing  Wrapper to primitive conversation

	}

}
