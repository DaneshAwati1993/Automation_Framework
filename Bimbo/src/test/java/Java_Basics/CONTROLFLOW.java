package Java_Basics;

import java.util.Scanner;

public class CONTROLFLOW {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

//		🟢 Basic Level (if, else, switch, for, while, do-while)
//
//		1️⃣ Even or Odd
//		👉 Take an integer input and check if it’s even or odd using if-else.
		
		int num1=11;
		if(num1%2==0)
		{
			System.out.println("The Entered Number is Even Number..");
		}
		else
		{
			System.out.println("The Entered Number is Odd Number..");
		}
//
//		2️⃣ Positive, Negative, or Zero
//		👉 Read a number and print whether it’s positive, negative, or zero.
		
		int num2=14;
		String result2=(num2>0) ? "Positive" : (num2<0) ?  "Negative" : "Zero";
		System.out.println("The Number is "+result2+" Number");
//
//		3️⃣ Greatest of Two Numbers
//		👉 Compare two numbers using if-else and print the greater one.

		int num31=16 , num32=15;
		if(num31>num32)
		{
			System.out.println("The Greatest Number is :"+num31);
		}
		else
		{
			System.out.println("The Greatest Number is :"+num32);
		}
		
//		4️⃣ Simple Calculator (switch)
//		👉 Input two numbers and an operator (+, -, *, /) → perform the operation using switch.
		/*
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1 :");
		double num41=sc.nextDouble();
		System.out.println("Enter the value of num2 :");
		double num42=sc.nextDouble();
		System.out.println("Enter the value of operator :");
		char operator=sc.next().charAt(0);
		double Result4;
		
		switch(operator)
		{
		case '+' :
		Result4=num41+num42;
		System.out.println("The sum of "+num41+" "+operator+" "+num42+"  = "+Result4);
		break;
		
		case '-' :
		Result4=num41-num42;
		System.out.println("The sum of "+num41+" "+operator+" "+num42+"  = "+Result4);
		break;
		
		case '*' :
		Result4=num41*num42;
		System.out.println("The sum of "+num41+" "+operator+" "+num42+"  = "+Result4);
		break;
		
		case '/' :
			if(num42!=0)
			{
				Result4=num41/num42;
				System.out.println("The sum of "+num41+" "+operator+" "+num42+"  = "+Result4);
			}
			else {
             	System.out.println("Error: Division by zero!");
         	}
		
		case '%' :
			if(num42!=0)
			{
				Result4=num41%num42;
				System.out.println("The sum of "+num41+" "+operator+" "+num42+"  = "+Result4);
			}
			else {
             	System.out.println("Error: Division by zero!");
         	}
			
 		default :
 			System.out.println("Invalid operator! Please use +, -, *, /, or %.");
		}
		*/
//
//		5️⃣ Grade Calculator
//		👉 Input marks (0–100) and print grade using if-else ladder.
//		Example: A ≥ 90, B ≥ 80, C ≥ 70, D ≥ 60, F otherwise.
		
		int marks5=55;
		if(marks5>=90)
		{
			System.out.println("The Student is obtained Grade as : A");
		}
		else if(marks5>=80 && marks5<90)
		{
			System.out.println("The Student is obtained Grade as : B");
		}
		else if(marks5>=70 && marks5<80)
		{
			System.out.println("The Student is obtained Grade as : C");
		}
		else if(marks5>=60 && marks5<70)
		{
			System.out.println("The Student is obtained Grade as : D");
		}
		else
		{
			System.out.println("The Student is obtained Grade as : F");
		}
		System.out.println("************************************");

//		6️⃣ Print 1 to 10 (for loop)
//		👉 Use a for loop to print numbers from 1 to 10.
		int num6=0;
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
System.out.println("************************************");
		
//		7️⃣ Sum of First N Natural Numbers
//		👉 Input n and calculate the sum using a while loop.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers : ");
		int n7=sc.nextInt();
		int sum=0;
		int i=1;
		
		while(i<=n7)
		{
			sum +=i;
			i++;
		}
		System.out.println("The Sum of "+n7+" Natural numbers is : "+sum);
		*/
		System.out.println("************************************");

//		8️⃣ Table of a Number
//		👉 Input an integer and print its multiplication table using a for loop.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers : ");
		int n8=sc.nextInt();
		System.out.println("Multiplication table for the Number : "+n8);
		for(int i=1; i<=10; i++)
		{
			System.out.println(n8*i);
		}
		*/
		
//		9️⃣ Countdown (do-while)
//		👉 Print numbers from 10 down to 1 using do-while.
		
		int num9=10;
		do
		{
			System.out.println(num9);
			num9--;
		}
		while(num9>=1);
//
//		🔟 Factorial (while loop)
//		👉 Input n, compute factorial using a loop.
		
		int n=5;
		int factor=1;
		for(int i=1; i<=n; i++)
		{
			factor *=i;
		}
		System.out.println(" The Factorial value of factor is : "+factor);
		System.out.println("The Loope is completed***********************************");
//
//		🟡 Intermediate Level
//
//		11️⃣ Largest of Three Numbers
//		👉 Input three numbers and find the largest using nested if.
		
		int num111=151, num112=150, num113=90;
		if (num111>num112 && num111>num113)
		{
			System.out.println(" The Largest number is : "+num111);
		}
		else if (num112>num111 && num112>num113)
		{
			System.out.println(" The Largest number is : "+num112);
		}
		else
		{
			System.out.println(" The Largest number is : "+num113);
		}
//
//		12️⃣ Leap Year Check
//		👉 Input year and check if it’s a leap year using conditional logic.
		int Year=2000;
		if(Year%4==0 && Year%100!=0 || Year%400==0)
		{
			System.out.println("The Year "+Year+" is the Leap Year..");
		}
		else
		{
			System.out.println("The Year "+Year+" is the Not-Leap Year..");
		}
//
//		13️⃣ Day of the Week (switch)
//		👉 Input an integer (1–7) and print corresponding weekday using switch.
		
		int day=4;
		switch(day)
		{
		case 1 : System.out.println("It's a Monday");break;
		case 2 : System.out.println("It's a Tuesday");break;
		case 3 : System.out.println("It's a Wednesday");break;
		case 4 : System.out.println("It's a Thurday");break;
		case 5 : System.out.println("It's a Friday");break;
		case 6 : System.out.println("It's a Saturday");break;
		case 7 : System.out.println("It's a Sunday");break;
		default : System.out.println("It's a Invalid Day");
		
		}
//
//		14️⃣ Sum of Even Numbers between 1 and N
//		👉 Use a loop to sum all even numbers up to N.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number of N : ");
		int N=sc.nextInt();
		int sum=0;
		for(int i=0; i<=N;i++)
		{
			if(i%2==0)
			{
			sum+=i;
			}
		}
		System.out.println("Sum of Even Numbers between 1 and N : "+sum);
		*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number of N : ");
		int N=sc.nextInt();
		int sum=0;
		for(int i=0; i<=N;i++)
		{
			if(i%2!=0)
			{
			sum+=i;
			}
		}
		System.out.println("Sum of Odd Numbers between 1 and N : "+sum);
		*/
		
//		15️⃣ Reverse Digits of a Number
//		👉 Input a number and reverse it using while.
		
		/*
		System.out.println("ENter the number of N : ");
		int num=sc.nextInt();
		int Rev=0;
		while(num>0)
		{
			Rev=Rev*10 + num % 10;
			num=num/10;
		}
		System.out.println("Reverse Digits of a Given Number is : "+Rev);
		System.out.println("The Loope is completed***********************************");
		*/
		
//		16️⃣ Palindrome Check (Number)
//		👉 Check if a number reads same forward and backward.
		
		/*
		System.out.println("ENter the number of Number : ");
		int num16=sc.nextInt();
        int originalNum = num16;   // store original number
		int Rev161=0;
		while(num16>0)
		{
			Rev161=Rev161*10 + num16 % 10;
			num16=num16/10;
		}
		System.out.println("Reverse Digits of a Given Number is : "+Rev161);
		if(Rev161==originalNum)
		{
			System.out.println("The Given number is Palindrome");
		}
		else
		{
			System.out.println("The Given number is Not-Palindrome");
		}
		
		*/
		System.out.println("The Loope is completed***********************************");
		
//		17️⃣ Prime Number Check
//		👉 Input a number and check if it’s prime using a loop and condition.
		
		/*
		System.out.println("ENter the number of Number : ");
		int num17=sc.nextInt();
		boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num17 <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num17 / 2; i++) {
                if (num17 % i == 0) {
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num17 + " is a Prime number.");}
        else {
            System.out.println(num17 + " is NOT a Prime number.");

    }
*/
		System.out.println("The Loope is completed***********************************");
		
//		18️⃣ Fibonacci Series :- 0,1,1,2,3,5,8,13,21,34,55...............................
//		👉 Print first N Fibonacci numbers using a loop.
		/*
		System.out.println("ENter the number of Number : ");
		int p=sc.nextInt();
		
		int First=0;
		int Second=1;
		System.out.print("Fibonacci Series: " + First + " , " + Second);
		
		for (int i=2; i<p; i++)
		{
			int Next=First + Second;
			System.out.print (" , " + Next);
			First=Second;
			Second=Next;			
		}
		*/
		System.out.println("\n The Loope is completed***********************************");

		
//		19️⃣ Count Digits in a Number
//		👉 Input number → count digits using loop and division.
		int num19=12345;
		int count=0;
		int OriginalNum19=num19;
		if(num19==0)
		{
			count=1;
		}
		else
		{

			while(num19!=0)
			{
				num19=num19/10;
				count++;
			}
		}

		System.out.println("Number of digits in "+OriginalNum19+"  is : "+count);
		System.out.println("***********************************");

//		20️⃣ Sum of Digits
//		👉 Input number → find sum of digits using while.
		int num20=123456789;
		int sum=0;
		int OriginalNum20=num20;
		while(num20 !=0)
		{
			sum=sum+num20%10;
			num20=num20/10;
		}
		System.out.println("Sum of digits for the Number "+OriginalNum20+"  is : "+sum);
//		🔴 Advanced Level
//
//		21️⃣ Menu-driven Calculator
//		👉 Show a menu (add, subtract, multiply, divide, exit).
//		Use do-while + switch to repeatedly take operations until user exits.
//
//		22️⃣ Nested Loops Pattern Printing
//		👉 Print patterns like:
//
//		*
//		**
//		***
//		****
//		*****
		
		int rows=6;
		for(int i=1; i<=rows; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}

//
//		23️⃣ Armstrong Number
//		👉 Input a number and check if it’s an Armstrong number (sum of cube of digits = number).
//
//		24️⃣ Perfect Number
//		👉 Check if a number is perfect (sum of divisors = number).
//
//		25️⃣ Number Pyramid Pattern
//		👉 Print:
//
//		1
//		12
//		123
//		1234
//		12345
//
//
//		26️⃣ Multiplication Table Grid (nested for)
//		👉 Print multiplication tables 1–10 in a grid format.
		int size=40;
        System.out.println("Multiplication Table (1 to " + size + "):\n");
		for(int i=1; i<=10; i++)						       // outer loop → rows
		{
			for(int j=1; j<=size; j++)							// outer loop → columns
			{
			System.out.printf("%4d", i*j);						//formatted spacing
		}
            System.out.println(); 								// new line after each row

		}
//
//		27️⃣ Strong Number
//		👉 Check if a number is strong (sum of factorial of digits = number).
//
//		28️⃣ Sum of Even & Odd Digits Separately
//		👉 Input number and find sum of even digits and odd digits separately.

		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number of N : ");
		int N=sc.nextInt();
		int sum=0;
		for(int i=0; i<=N;i++)
		{
			if(i%2==0)
			{
			sum+=i;
			}
		}
		System.out.println("Sum of Even Numbers between 1 and N : "+sum);
		*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number of N : ");
		int N=sc.nextInt();
		int sum=0;
		for(int i=0; i<=N;i++)
		{
			if(i%2!=0)
			{
			sum+=i;
			}
		}
		System.out.println("Sum of Odd Numbers between 1 and N : "+sum);
		*/
		
//		29️⃣ Number Guessing Game (while + random)
//		👉 Generate random number and keep asking user until they guess correctly.
//
//		30️⃣ Prime Numbers between 1 and 100
//		👉 Use nested loops to print all primes in range.
		
		for (int num = 2; num <= 100; num++) {   // outer loop → check each number
            boolean isPrime = true;
            
		for(int i=2; i<=num/2; i++)				// inner loop → check divisibility
		{
			if(num%i==0)
			{
				isPrime=false;					//Not Prime Number
				break;
			}
		}
        if (isPrime) {
        System.out.print(num + " , ");
        }	
		}
	}
}
