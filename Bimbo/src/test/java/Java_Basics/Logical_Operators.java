package Java_Basics;

import java.util.Scanner;

public class Logical_Operators {

	public static void main(String[] args) {

//	    🔹 2. Logical Operators (&&, ||, !)
//		🟢 Basic Level
//
//		1️⃣ Check whether a number is divisible by both 3 and 5.
		
		int num=11;
		int rem1=num % 3; 
		int rem11=num % 5;
		if(rem1==0 && rem11==0)
		{
			System.out.println("The given number is divisible by both 3 and 5.");
		}
		else if(rem1==0 )
			{
				System.out.println("The given number is divisible by only 3.");
			}
		else if(rem11==0 )
			{
				System.out.println("The given number is divisible by only 5.");
			}
		else
		{
			System.out.println("The given number is not divisible by both 3 and 5.");
		}
		
		
//		2️⃣ Check whether a number is divisible by 3 or 7.
		int num2=35;
		int rem21=num2 % 3; 
		int rem22=num2 % 7;
		if(rem21==0)
		{
			System.out.println("The given number is divisible by 3");
		}
		else if(rem22==0 )
			{
				System.out.println("The given number is divisible by 7.");
			}
		else if(rem22==0 && rem21==0)
		{
			System.out.println("The given number is divisible by both 3 and 7.");
		}
		else
			{
				System.out.println("The given number is not divisible by  3 and nor by 7.");
			}
		
//		3️⃣ Check if a given number is not negative.
		int num3=13;
		if(num3>=0)
		{
			System.out.println("The given number is the Positive Number......");
		}
		else
		{
			System.out.println("The given number is the Negative Number......");
		}
		
//		4️⃣ Verify if a student passed in all three subjects (marks ≥ 40).
		
		int sub1=50 ,sub2=41, sub3=40;
		if(sub1>=40 && sub2>=40 && sub3>=40)
		{
			System.out.println("Student is Passed in all the Subjects");
		}
		else
		{
			System.out.println("Student is Failed in Exam...");
		}
		
//		5️⃣ Check if temperature is within a safe range (20–80).
		
		double temp=75.8;
		if(temp>=20 && temp<=80)
		{
			System.out.println("The Temperature is within the safe range..");
		}
		else
		{
			System.out.println("The Temperature is out of the safe range..");
		}
		
//
//		🟡 Intermediate Level
//
//		6️⃣ Input age and citizenship; check if a person is eligible to vote.
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age... : ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("The Citizenship is Eligible to Vote...!");
		}
		else
		{
			System.out.println("The Citizenship is Not-Eligible to Vote...!");
		}
		*/
		
//		7️⃣ Check if a year is a leap year (divisible by 4 && not divisible by 100 || divisible by 400).
		
		int Year=2400;
		int div4=Year%4 , div100=Year%100 , div400=Year%400;
		if (div4==0 && div100!=0 || div400==0)
		{
			System.out.println("The Year "+Year+" is the Leaf Year...");
		}
		else
		{
			System.out.println("The Year "+Year+" is not the Leaf Year...");
		}
		
//		8️⃣ Verify if a triangle is valid (a + b > c && b + c > a && a + c > b).
		
		int a=20, b=20, c=40;
		
		if(a+b>c && b+c>a && a+c>b)
		{
			System.out.println("Triangle is the Valid...");
		}
		else 
		{
			System.out.println("Triangle is the Not-Valid...");
		}
//		9️⃣ Validate if a character is a vowel (a, e, i, o, u).
		
		char ch='A';
		ch=Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("The Entered character is Vowel....");
		}
		else
		{
			System.out.println("The Entered character is Not-Vowel....");
		}
//		🔟 Check if a student qualifies for scholarship (marks ≥ 85 or sports participation = true).
		
		double marks=85;
		boolean sport=false;
		if (marks>=85 || sport==true)
		{
			System.out.println("Student is qualifies for the scholarship...");
		}
		else
		{
			System.out.println("Student is Not-qualifies for the scholarship...");
		}
//
//		🔴 Advanced Level
//
//		11️⃣ Check login validation (username == "admin" && password == "1234").
		/*
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName : ");
		String username=sc.next();
		System.out.println("Enter the Password : ");
		String password=sc.next();
		
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234"))
		{
			System.out.println("User logged in Successfully......");
		}
		else
		{
			System.out.println("Username or password is not valid logged in Successfully......");
		}
		
		*/
		
//		12️⃣ Verify if a point (x, y) lies inside a rectangle defined by (x1, y1) and (x2, y2).
//		13️⃣ Determine if a person qualifies for loan based on age, salary, and credit score.
//		14️⃣ Check if a number is a multiple of both 2 and 3 but not of 5.
//		15️⃣ Simulate a security gate: grant entry only if (card swiped and pin correct) or (admin override).
	}

}
