package Java_Basics;

import java.util.Scanner;

public class Arithmetic_Operators_Practice_Questions {

	public static void main(String[] args) {

//		🔹 Level 1 — Basics
//		1️⃣ Write a Java program to add two numbers and display the result.
		
		int a1=15, b1=5;
		System.out.println("Sum of a1 & b1 is : " +(a1+b1));
		
//		2️⃣ Write a program to subtract one number from another and print the result.
		
		System.out.println("Substarct of a1 & b1 is : " +(a1-b1));
		
//		3️⃣ Write a program to multiply two numbers and display the product.
		
		System.out.println("Multiplication of a1 & b1 is : " +(a1*b1));
		
//		4️⃣ Write a program to divide two integers and print both the quotient and remainder.
		
		System.out.println("Division of  of a1 & b1 is : " +(a1/b1));
		
//		5️⃣ Write a program to demonstrate increment and decrement operators (++, --) and show their effect in both prefix and postfix form.
		
		int c=1;
		int d=c++;
		System.out.println("Post Incrementation.......: "+c+" "+d);
		
		int e=1;
		int f=++e;
		System.out.println("Pre Incrementation.......: "+e+" "+f);
		
		int g=1;
		int h=g--;
		System.out.println("Post Decrement.......: "+g+" "+h);
		
		int a4=1;
		int a5=--a4;
		System.out.println("Pre Decrement.......: "+a4+" "+a5);
		
//		6️⃣ Evaluate and print the result of the expression: (a + b) * (a - b)
			
		int a=15, b=5;
		System.out.println("The result of the expression--> (a + b) * (a - b) is : "+((a + b) * (a - b)));
		
		
//		🔹 Level 2 — Intermediate
//
//		7️⃣ Predict and then print the result of the following code snippet:

		int x = 10, y = 5;
		int result = x + y * 2 - x++ / 2;
		System.out.println(result);
		
//		8️⃣ Write a program that demonstrates the use of compound assignment operators (+=, -=, *=, /=, %=).
		
		int z = 10, z1=10, z2=10, z3=10, z4=10, z5=10;

        System.out.println("Initial value of a: " + z);

        // Using += operator
        z1 += 5;   // same as z1 = z1 + 5
        System.out.println("After z1 += 5 → " + z1);

        // Using -= operator
        z2 -= 3;   // same as z2 = z2 - 3
        System.out.println("After z2 -= 3 → " + z2);

        // Using *= operator
        z3 *= 2;   // same as z3 = z3 * 2
        System.out.println("After z3 *= 2 → " + z3);

        // Using /= operator
        z4 /= 4;   // same as z4 = z4 / 4
        System.out.println("After z4 /= 4 → " + z4);

        // Using %= operator
        z5 %= 3;   // same as z5 = z5 % 3
        System.out.println("After z5 %= 3 → " + z5);
        
//      9️⃣ Write a program to convert total minutes into hours and minutes.
//      Example: 135 minutes → 2 hours 15 minutes.
        
        int min=135;  //total minutes
        int hour=60;	// minutes in 1 Hours
        
        System.out.println("135 mins is equal to : "+(min/hour)+ " "+ "Hours" +" "+ (min%hour)+" "+"Minutes");
        
//      10️⃣ Write a program to calculate the area and perimeter of a rectangle given length and width.
        
        int len=10;
        int width=8;
        
        int area=len*width;
        int perimeter=2*(len+width);
        
        System.out.println("Area of the Rectangular is : "+area);
        System.out.println("Perimeter of the Rectangular is : "+perimeter);
        
//      11️⃣ Write a program to swap two variables without using a third variable (only arithmetic operators).
        
        int num1=10;
        int num2=20;
        
        System.out.println("Before Swapping of num1 & num2: "+num1 +"   "+num2);
        
        num1=num1+num2;				//	10 + 20 =30
        num2=num1-num2;				//	30 - 20 =10
        num1=num1-num2;				//	30 - 10 =20 
        		
        
        System.out.println("After Swapping of num1 & num2: "+num1 +"   "+num2);
        
        
//        🔹 Level 3 — Advanced
//
//        12️⃣ Write a program to find the sum of digits of a 3-digit number.
        
        int num3=12456;
        int sum=0;
        
        while(num3>0)
        {
        	sum=sum+num3%10;
        	num3=num3/10;
        }
        
    	System.out.println("Sum of digits : "+sum);
        
//        13️⃣ Write a program to reverse a 3-digit number using / and % operators.
    	
    	 int num4=1356;
    	 int rev=0;
    	 while(num4>0)
    	 {
    		 rev=rev*10+num4%10;
    		 num4=num4/10;    		 
    	 }
     	System.out.println("Reverse of the digits : "+rev);

    	
//        14️⃣ Write a program to convert rupees into dollars using a fixed conversion rate.
     	
     	final double dol=85.75;
     	double rs=7536;
     	
     	double convdol=rs/dol;
     	System.out.println("rupees into dollars using a fixed conversion rate.  : "+convdol);
     	
//        15️⃣ Write a program to calculate BMI (Body Mass Index) given weight (kg) and height (m).
     	
     	double weight=70;
     	double height=1.75;
     	double BMI=weight/(height*height);
     	System.out.println("Your Body Mass Index is : "+BMI);
     	
//        16️⃣ Write a program to calculate the average of five numbers.
     	
     	int d1=10, d2=20, d3=30, d4=40, d5=50;
     	int avg=(d1+d2+d3+d4+d5)/5;
     	System.out.println("average of five numbers. : "+avg);
     			
//        17️⃣ Write a program to calculate the total marks and percentage of a student given marks in five subjects.
     	
     	int sub1=70, sub2=80, sub3=65, sub4=95, sub5=80, Total=500;
     	int totobtainedmarks=(sub1+sub2+sub3+sub4+sub5);
     	int percentage=totobtainedmarks/5;
     	System.out.println("total marks student given marks in five subjects. : "+totobtainedmarks);
     	System.out.println("percentage of a student given marks in five subjects. : "+percentage);

     	
     	
//        18️⃣ Write a program to compute aⁿ (a power n) without using Math.pow().
     	
     	int numa=5;
     	int numn=6;
     	int result1=1;
     	for (int i=1; i<=numn; i++)
     	{
     		result1 *=numa;
     	}
     	System.out.println("Result of the n power of number a : "+result1);
     		  		
//        19️⃣ Write a program to calculate the distance between two points (x1, y1) and (x2, y2) using the formula:
//        √((x2 - x1)² + (y2 - y1)²)
     	
     	double x1=10, y1=10, x2=20, y2=20;
     	double distance= Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
     	System.out.println("distance between two points (x1, y1) and (x2, y2) is : "+distance);
     	
     	
//        20️⃣ Write a program to calculate Simple Interest using the formula SI = (P * T * R) / 100.
     	
     	int P=10000, T=3, R=10;
     	int SI = (P * T * R) / 100;
     	System.out.println("Simple Intrest on the Principal AMount  "+P + " "+"is  : "+SI);
//        21️⃣ Write a program to convert temperature from Celsius to Fahrenheit using the formula F = (C * 9 / 5) + 32.
     	
     	double C=35.5, F=((C * 9 / 5) + 32);
     	System.out.println("temperature from Celsius to Fahrenheit for the Temperature "+C+" "+ " is : "+F);

     	
//     	🔹 Level 4 — Challenge Problems
//
//     	22️⃣ Write a program to extract and print the last digit of an integer.
     	
     	int num10= 123456789;
     	int last=num10%10;

     	System.out.println("Last digit of the number is : "+last);
     	
//     	23️⃣ Write a program to check whether a number is divisible by both 5 and 11.
     	
     	double num11=441;
     	double rem1=num11 % 5 , rem2=num11 % 11;
     	
     	if (rem1==0 && rem2==0)
     	{
     		System.out.println("number is divisible by both 5 and 11.");
     	}
     	else if  (rem1==0)
     	{
     		System.out.println("number is divisible by 5");
     	}
     	else if  (rem2==0)
     	{
     		System.out.println("number is divisible by 11");
     	}
     	else 
     	{
     		System.out.println("number is not divisible by 5 and 11");
     	}
//     	24️⃣ Evaluate the expression and explain the result:
//
     	int a11 = 5, b11 = 3;
     	int result11 = a11++ + ++a11 * b11-- - --b11;
     	System.out.println(result11);
//
//
//     	25️⃣ Write a program to calculate an employee’s net salary using the formula:
//     	NetSalary = Basic + HRA + DA - PF
//     	(Take all values as user input).
     	/*
     	Scanner sc=new Scanner(System.in);
     	
     	System.out.println("Enter the employees Basic Salary : ");
     	double Basic=sc.nextDouble();
     	
     	System.out.println("Enter the employees HAR : ");
     	double HRA=sc.nextDouble();
     	
     	System.out.println("Enter the employees DA : ");
     	double DA=sc.nextDouble();
     	
     	System.out.println("Enter the employees PF : ");
     	double PF=sc.nextDouble();
     	
     	double NetSalary = Basic + HRA + DA - PF ;
     	
     	System.out.println("Employee’s net salary is : "+NetSalary);
     	*/
     	
//     	26️⃣ Write a program to convert total minutes into days, hours, and minutes.
     	/*
     	Scanner sc = new Scanner(System.in);
     	System.out.println("Enter the Total minutes : ");
     	int minute=(int) sc.nextDouble();
     	
     	int days=(minute / (60*24));
     	int Hours = ((minute % (60*24))/60);
     	int Minutes = ((minute % (60*24))%60);
     	
     	System.out.println("Total Minutes into : "+days+" Days,"+Hours+" Hours ,"+Minutes+" Minutes");
    */         	
     	
//     	27️⃣ Write a program to find the sum and average of all digits of any positive integer.
     	/*
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the number : ");
     	int num14=(int) sc.nextDouble();     	
     	
     	int Positivesum=0;
     	int count = 0;
     	
     	
     	while (num14>0)
     	{
     		Positivesum=Positivesum+num14%10;
     		count++;
     		num14 =num14/ 10;

     	}
     	double Pavg = (double) Positivesum / count ; 
     	System.out.println("Total digit of the Entered value is : "+count);
     	
     	System.out.println("The Sum of the Total Digits of the Entered value is : "+Positivesum);
     	System.out.println("The Average of the Total Digits of the Entered value is : "+Pavg);
     	*/
     	
//     	28️⃣ Write a program to find the remainder when one number is divided by another.
     	/*
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the 1st number : ");
     	int num15=sc.nextInt();
     	System.out.println("Enter the 2nd number : ");
     	int num16=sc.nextInt();
     	int rem15 = num15 % num16;
     	System.out.println("remainder, when one number is divided by another : "+rem15);
     	*/
     	
//     	29️⃣ Write a program to compute the perimeter and area of a circle given its radius.
     	/*
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the Radius of the Circle : ");
     	double Radius=sc.nextDouble();
     	double Area=(double) Radius * Radius * 3.142;
     	double Perimeter = (double) Radius * 2 * 3.142;
     	System.out.println("Perimeter of the Circle is : "+Perimeter);
     	System.out.println("Area of the Circle is : "+Area);
     	*/
     	
//     	30️⃣ Write a program to evaluate a combined expression:
//    	results1 = ((m1 + n1) / o1) * (p1 - q1) % r1     	
//     	and print the output.
     	
     	double m1=10,n1=5,o1=2,p1=10,q1=5,r1=5;
     	double results1 = ((m1 + n1) / o1) * (p1 - q1) % r1 ;
     	System.out.println("Final value for the Above Expression is : "+results1);

//     	🧩 Mini-Projects (Optional Practice)
//
//     	31️⃣ Create a Simple Calculator using switch statements that performs + - * / %.
     	
     	/*
     	
     	Scanner sc=new Scanner(System.in);
     	
     	System.out.println("Enter the num1 value : ");
     	double numb1=sc.nextDouble();
     	
     	System.out.println("Enter the num1 value : ");
     	double numb2=sc.nextDouble();
     	
     	System.out.println("Enter the operator value : ");
     	char operator=sc.next().charAt(0);
     	
     	double Results1;
     	
     	switch(operator)
     	{
     	case '+':
     	Results1=numb1 + numb2;
     	System.out.println("The Sum of numb1 & numb2 : "+Results1);
     	break;
     	
     	case '-':         	
     	Results1=numb1 - numb2;
     	System.out.println("The Substarct of numb1 & numb2 : "+Results1);
     	break;
     	
     	case '*':         	
     	Results1=numb1 * numb2;
     	System.out.println("The Product of numb1 & numb2 : "+Results1);
     	break;
     	
     	case '/':
         	if(numb2 !=0)
         	{
     	Results1=numb1 / numb2;
     	System.out.println("The Division of numb1 & numb2 : "+Results1);
         	}
         	else {
             	System.out.println("Error: Division by zero!");
         	}

     	
     	case '%':
     		if(numb2 !=0)
         	{
     	Results1=numb1 % numb2;
     	System.out.println("The Division of numb1 & numb2 : "+Results1);
         	}
     		else {
     	System.out.println("Error: Division by zero!");   	
     	}
     		default :
     			System.out.println("Invalid operator! Please use +, -, *, /, or %.");
     	}
     	
     	*/
     	
//     	32️⃣ Create a Marks to Grade Converter that takes total marks and prints a grade based on percentage.
     	/*
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the Total Percentage of the marks : ");
     	double perc=sc.nextDouble();
     	
     	if(perc>=90)
     	{
     		System.out.println("The Student Obtains the Grade is A+");
     	}
     	else if(90> perc && perc >=80)
     	{
     		System.out.println("The Student Obtains the Grade is A");
     	}
     	else if(80> perc && perc >=70)
     	{
     		System.out.println("The Student Obtains the Grade is B+");
     	}
     	else if(70> perc && perc >=60)
     	{
     		System.out.println("The Student Obtains the Grade is B");
     	}
     	else if(60> perc && perc >=50)
     	{
     		System.out.println("The Student Obtains the Grade is C+");
     	}
     	else if(50> perc && perc >=35)
     	{
     		System.out.println("The Student Obtains the Grade is C");
     	}
     	else 
     	{
     		System.out.println("The Student is Failed");
     	}	
     	*/
     	
//     	33️⃣ Build a Shopping Discount Calculator — input total amount and discount rate, output discounted price.
     	
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the Total AMount : ");
     	double TotAmount=sc.nextDouble();
     	System.out.println("Enter the Discount %age  : ");
     	double Disc=sc.nextDouble();
     	
     	double Discount= TotAmount * Disc / 100;
     	
     	double finalAmount = TotAmount - Discount ;
     	
     	System.out.println("The Total amount of Invoice is : "+TotAmount);
     	System.out.println("The Discount rate is : "+Disc);
     	System.out.println("Total Discount applied on the Invoice is : "+Discount);
     	System.out.println("The Total amount of Invoice after Discount amount is : "+finalAmount);

	}

}
