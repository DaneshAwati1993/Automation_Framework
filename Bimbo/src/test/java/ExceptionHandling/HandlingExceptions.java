package ExceptionHandling;

import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {

		try {
		System.out.println("Start of the Programm");

		//Ex 1:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		System.out.println(100/num);
		sc.close();
		System.out.println("End of the Programm");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("End of the programm");
		}

	}

}
