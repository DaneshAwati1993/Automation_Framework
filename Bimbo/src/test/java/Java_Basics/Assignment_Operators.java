package Java_Basics;

import java.util.Scanner;

public class Assignment_Operators {
	
	public static void main(String[] args) {
	
//	🟢 Basic Level
//
//	1️⃣ Demonstrate the effect of +=, -=, *= on a variable.
		int num1=10;
		System.out.println("The entered number is : "+num1);
		num1 +=5;
		System.out.println("The number after +=5 is : "+num1);
		num1 -=3;
		System.out.println("The number after -=3 is : "+num1);
		num1 *=2;
		System.out.println("The number after *=2 is : "+num1);
		
		System.out.println("**********************************");

		
//	2️⃣ Input a number and add 5 using +=.
		int num2=10;
		System.out.println("The entered number is : "+num2);
		num2 +=5;
		System.out.println("The Sum after +=5 is : "+num2);
		System.out.println("**********************************");

//	3️⃣ Multiply a number by 3 using *= and print the result.
		int num3=13;
		System.out.println("The entered number is : "+num3);
		num3 *=3;
		System.out.println("The Product of the Number after *=3 is : "+num3);
		
		System.out.println("**********************************");

//	4️⃣ Divide a number by 2 using /=.
		int num4=12;
		System.out.println("The entered number is : "+num4);
		num4 /=2;
		System.out.println("The Division of the Number using /=2 is : "+num4);	
		System.out.println("**********************************");

//	5️⃣ Compute remainder when dividing by 5 using %=.
		int num5=12;
		System.out.println("The entered number is : "+num4);
		num5 %=5;
		System.out.println("The Reminder after Division of the Number using %=5 is : "+num5);	
		System.out.println("**********************************");
		
//	🟡 Intermediate Level
//
//	6️⃣ Use compound assignment operators in a loop to calculate cumulative sum.
	/*	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of numbers cululative need to calculate : ");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1; i<n; i++)
	{
		sum +=i;
	}
	System.out.println("The Cumulative sum of first "+n+" is  : "+sum);
	*/
	System.out.println("**********************************");
		
//	7️⃣ Implement a counter that increments by 2 using +=.
	
	int counter=0;
	System.out.println("Enter the Counter length for calculate of increment of 2 by += : ");

	while(counter <=10)
	{
		System.out.println("Counter = " + counter);
		counter +=2;
	}
	System.out.println("The Loope is completed***********************************");
	
//	8️⃣ Calculate totalPrice after applying tax and discount using compound assignments.
	double Price=100;
	double tax=17.5;
	double discount=8.75;
	Price +=Price * tax / 100;
	Price -=Price * discount / 100; 
	System.out.println(" The Total Price after the Tax and discount is : "+Price);
	
//	9️⃣ Use *= in a factorial calculation.
	int n=10;
	int factor=1;
	for(int i=1; i<=n; i++)
	{
		factor *=i;
	}
	System.out.println(" The Factorial value of factor is : "+factor);
	System.out.println("The Loope is completed***********************************");

//	🔟 Simulate salary increment — each year multiply by 1.1 using *=.
	/*
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Salary of the Employee is : ");
	double Salary=sc.nextDouble();
	System.out.println("Enter the number of Yesrs : ");
	int Year=sc.nextInt();
	for(int i=1; i<=Year; i++)
	{
		Salary *=1.1;
		System.out.println("The Salary after the : "+i+"st"+ " increment is : "+Salary);
	}
	*/
	System.out.println("The Loope is completed***********************************");
//
//	🔴 Advanced Level
//
//	11️⃣ Chain multiple compound assignments in one statement and explain the result.
	int num11=10;
	System.out.println("The entered number is : "+num11);
	num11 +=5;
	System.out.println("The number after +=5 is : "+num11);
	num11 -=3;
	System.out.println("The number after -=3 is : "+num11);
	num11 *=2;
	System.out.println("The number after *=2 is : "+num11);
	
	System.out.println("**********************************");
//	12️⃣ Demonstrate operator precedence using x += y *= 2.
	
	int x=10;
	int y=10;
	for(int i=1; i<=10; i++)
	{
		x +=y *=2;
		System.out.println("Finally the value of x is : "+x+ "  &  The value of y is : "+y+ " at the : "+i);
				
	}
	System.out.println("**********************************");

//	13️⃣ Update a bank balance after deposits and withdrawals using += and -=.
	/*
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the deposit amount : ");
	double deposit=sc.nextDouble();
	System.out.println("Enter the Withdrawal amount : ");
	double withdraw=sc.nextDouble();
	
	double accBal=10000;
	accBal += deposit;
	accBal -=withdraw;
	System.out.println("The Account balance after deposits and withdrawals using += and -=. is :  "+accBal);
	*/
	System.out.println("**********************************");
	
//	14️⃣ Calculate running average using combined /= and +=.
	/*
	Scanner sc = new Scanner(System.in);

    double sum = 0;
    int count = 0;
    double average = 0;

    System.out.println("Enter numbers (enter -1 to stop):");

    while (true) {
        double num = sc.nextDouble();

        if (num == -1)
        
            break; // stop input when user enters -1
        
        sum += num;   // same as sum = sum + num
        count += 1;   // same as count = count + 1
        average = sum; 
        average /= count;  // same as average = sum / count

        System.out.printf("After %d numbers, running average = %.2f%n", count, average);
    }
*/
	System.out.println("**********************************");
//	15️⃣ Implement compound interest formula using successive compound assignments.
	double Principal=10000;
	double interest=10;
	double amount=Principal;
	int Years=5;
	for (int i=1; i<=Years; i++)
	{
		amount *=(1+ (interest/100));
	}
	System.out.println("Total amount after "+Years+" Years is : "+amount);
	System.out.println(" Total Interest for the "+Years+" Years is : "+(amount-Principal));

}
}
