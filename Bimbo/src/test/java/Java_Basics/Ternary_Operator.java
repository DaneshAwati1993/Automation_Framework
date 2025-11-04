package Java_Basics;

public class Ternary_Operator {

	public static void main(String[] args) {


//		🟢 Basic Level
//
//		1️⃣ Check if a number is even or odd using ternary operator.
		int a=13;
		String rem=((a%2) ==0) ? "Even" : "Odd";
		System.out.println("The Entered number is : "+rem);
		
//		2️⃣ Print “Pass” if marks ≥ 40, else “Fail”.
		int marks=39;
		String Result=(marks>=40) ? "Pass" : "Fail";
		System.out.println("The Result is : "+Result);
		
//		3️⃣ Check if a person is adult (age >= 18).
		int age=15;
		String Result1=(age>=18) ? "adult" : "Not-adult";
		System.out.println("The person is : "+Result1);
		
//		4️⃣ Find the largest of two numbers.
		int c=100, b=99;
		int x=(c>b) ? c : b;
		System.out.println("The Largest number is : "+x);
		
//		5️⃣ Determine sign of a number (“Positive”, “Negative”, or “Zero”).
		int e=0;
		{
		String y=(e>0)? "Positive" : (e<0) ? "Negative" :"Zero";
		System.out.println(e+" is the "+y+" number....");
		}

//		🟡 Intermediate Level
//
//		6️⃣ Find the largest of three numbers using nested ternary.
		int f=300, g=200, h=150;
		int z=(f>g&& f>h)? f:(g>f && g>h)? g : h;
		System.out.println("The largest number is : "+z);
		
//		7️⃣ Print “Eligible” if salary > 25000 and experience > 2 years, else “Not eligible”.
		int Sal=30000, Exp=2;
		String eli=(Sal>25000 && Exp>2)? "Eligible" : "Not-Eligible";
		System.out.println("Verify the Eligibilty of the Person is : "+eli);
		
//		8️⃣ Convert marks to grade (A/B/C/D/F) using nested ternary operators.
		int Marks = 45;
		char grade=(Marks>=90)? 'A': (Marks>=75 && Marks<=90)? 'b':(Marks>=60 && Marks<=75)? 'C':
		(Marks>=35 && Marks<=60)? 'D': 'F';
		System.out.println("Grade Obtained by the Student is : "+grade);
		
//		9️⃣ Display "Leap Year" or "Not Leap Year" using ternary.
		int Year=2000;
		String leap=(Year%4==0 && Year%100!=0 || Year%400==0)? "Leap Year" :"Not-Leap Year" ;
		System.out.println("The Year is "+leap+" Year");
		
//		🔟 Print the absolute value of an integer using ternary.
//
//		🔴 Advanced Level
//
//		11️⃣ Print which among 4 numbers is largest using chained ternary.
		
		int num111=300, num112=200, num113=150, num114=250;
		int large=(num111>num112 && num111>num113 && num111>num114)? num111:
			(num112>num111 && num112>num113 && num112>num114)? num112:
			(num113>num112 && num113>num111 && num113>num114)? num113: num114;
		System.out.println("The largest number is : "+large);
		
//		12️⃣ Use ternary inside a print statement to classify age groups (child/teen/adult/senior).
		
//		13️⃣ Combine ternary with logical operators for eligibility check.
//		14️⃣ Recreate a simple calculator using nested ternary.
//		15️⃣ Implement conditional fee calculation using ternary based on category (student, staff, guest).
	}

}
