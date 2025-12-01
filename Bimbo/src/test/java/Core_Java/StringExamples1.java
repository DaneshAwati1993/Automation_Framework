package Core_Java;

import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class StringExamples1 {

	public static void main(String[] args) {

		System.out.println("Palidrom String : \n------------------------------------");
		String a1="12321";
		String rev="";
		for(int i=a1.length()-1;i>=0;i--)
		{
			rev=rev+a1.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(a1))
			System.out.println("Given String "+a1+" is Palidrom String");
		else
			System.out.println("Given String "+a1+" is not-Palidrom String");
		
		System.out.println("\nGenerate Random Numbers and String : \n------------------------------------");
		System.out.println("\nApproach-1 : \n--------------------------");
		Random a2=new Random();
		int a3=a2.nextInt(10);
		System.out.println(a3);
		int a4=a2.nextInt(100);
		System.out.println(a4);
		int a5=a2.nextInt(1000);
		System.out.println(a5);
		
		System.out.println("\nApproach-2 : \n--------------------------");
		
		System.out.println(Math.random());
		
		System.out.println("\nApproach-3 : \n--------------------------");
		
		String a6=RandomStringUtils.randomNumeric(12);
		System.out.println(a6);
		
		String a7=RandomStringUtils.randomAlphabetic(5);
		System.out.println(a7);
		
		System.out.println("\nRemove Junk or Special Characters from String : \n------------------------------------------------------");
		
		String a8="*&^W*&e9876*&^lc#$%om987656e$%^ ^%of J^$@av*&%><:a";
		
		//Regular Expression : 
		
		String a9=a8.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(a9);
		
		String a10=a8.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a10);
		
		String a11=a8.replaceAll("[^a-zA-Z]", "");
		System.out.println(a11);
		
		String a12=a8.replaceAll("[^0-9]", "");
		System.out.println(a12);
		
		
		System.out.println("\nRemove White Spaces from String : \n------------------------------------------------------");

		String a13="  Wel com  e t  o J  ava  ";
		
		a13=a13.replaceAll("\\s", "");
		System.out.println(a13);
			
		System.out.println("\nReverse aplhabtes within String : \n------------------------------------------------------");
		String a14="abc123xyz234";
		int left=0, Right=a14.length()-1;
		
		char a15[]=a14.toCharArray();
		
		while(left<Right)
		{
			if(Character.isDigit(a15[left]))
				left++;
			else if (Character.isDigit(a15[Right]))
				Right--;
			else
			{
				char temp=a15[left];
				a15[left]=a15[Right];
				a15[Right]=temp;
				left++;
				Right--;
			}
		}
		System.out.println(new String(a15));
		System.out.println(new String(a14));
		
		System.out.println("\nAnagram String : \n----------------------------");
		String a16="Silent";
		String a17="Listen";
		
		a16=a16.toLowerCase();
		a17=a17.toLowerCase();
		
		if(a16.length()==a17.length())
		{
			char a18[]=a16.toCharArray();
			char a19[]=a17.toCharArray();
			Arrays.sort(a18);
			Arrays.sort(a19);
			Boolean Result=Arrays.equals(a18, a19);
			
			if(Result==true)
			{
				System.out.println("Given String "+a16+" and "+a17+" are an Anagram Strings");
			}
			else
				System.out.println("Given String "+a16+" and "+a17+" are not-Anagram Strings");			
		}
		else 
		{
			System.out.println("Length is not matching");
			System.out.println("Given String "+a16+" and "+a17+" are not-Anagram Strings");
		}
		
		System.out.println("\nPangram String : \n----------------------------");
		
		 String a20 = "The quick brown fox jumps over the lazy dog";
		 int flag=1;	// is Panagram String 
		 a20=a20.toLowerCase();
		 if (a20.length()<16)
		 {
			System.out.println("Given String "+a20+" is not-Panagram Strings");	
		 }
		 else
		 {
			for(char ch='a';ch<='z';ch++)	//ascii code
			{
				if(a20.indexOf(ch)<0)
				{
					flag=0;
				}
			}
			if(flag==0)
			{
				System.out.println("Given String "+a20+" is not-Panagram Strings");	
			}
			else
			System.out.println("Given String "+a20+" is Panagram Strings");	
		 }

		
	}

}
