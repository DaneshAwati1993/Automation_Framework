package ExceptionHandling;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {

		System.out.println("Start of the Programm");
		Scanner sc=new Scanner(System.in);
		/*
		//Ex 1:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		System.out.println(num);
		
		*/
		/*
		//Ex 2 : 
		int arr[]=new int[5];
		System.out.println("Enter an position(0-4)");
		int position=sc.nextInt();
		System.out.println("Enter a Value");
		int value=sc.nextInt();
		
		arr[position]=value;
		System.out.println(arr[position]);
		
		*/
		/*
		//EX 3:
		//String str="12345";
		String str="Danesh";
		int num=Integer.parseInt(str);
		System.out.println(num);
		*/
		
		//Ex 5 :
		
		//String s="Danesh";
		//String s="";
		String s=null;
		
		System.out.println(s.length());
		
		System.out.println("End of the Programm");
	}

}
