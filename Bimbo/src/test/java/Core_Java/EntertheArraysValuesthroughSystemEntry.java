package Core_Java;

import java.util.Arrays;
import java.util.Scanner;

public class EntertheArraysValuesthroughSystemEntry {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		/*
		System.out.println("Enter the Length of an Array : ");
		int num1=sc.nextInt();
		
		int a1[]=new int[num1];
		
		for (int i=0; i<a1.length; i++)
		{
			System.out.println("Enter the value of a1["+i+"] : ");
			a1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a1));
		
		
		System.out.println("Enter the Length of an Array : ");
		int num2=sc.nextInt();
		System.out.println("Enter the Length of an Array : ");
		int num3=sc.nextInt();
		
		int a2[][]=new int[num2][num3];
		
		for (int i=0; i<a2.length; i++)
		{
			for (int j=0; j<a2[i].length; j++)
			{
				System.out.println("Enter the value of a2["+i+"]["+j+"] : ");
				a2[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(a2));
		*/
		
		System.out.println("Enter the Length of Rows : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the Length of Columns : ");
		int num3 = sc.nextInt();

		int a2[][] = new int[num2][num3];

		for (int i = 0; i < a2.length; i++) {
		    for (int j = 0; j < a2[i].length; j++) {
		        System.out.println("Enter the value of a2[" + i + "][" + j + "] : ");
		        a2[i][j] = sc.nextInt();
		    }
		}

		System.out.println("\nMatrix Output:");
		for (int i = 0; i < a2.length; i++) {
		    for (int j = 0; j < a2[i].length; j++) {
		        System.out.print(a2[i][j] + " ");
		    }
		    System.out.println(); // move to next line
		}

	}

}
