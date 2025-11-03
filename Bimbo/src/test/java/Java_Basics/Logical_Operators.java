package Java_Basics;

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
//		4️⃣ Verify if a student passed in all three subjects (marks ≥ 40).
//		5️⃣ Check if temperature is within a safe range (20–80).
//
//		🟡 Intermediate Level
//
//		6️⃣ Input age and citizenship; check if a person is eligible to vote.
//		7️⃣ Check if a year is a leap year (divisible by 4 && not divisible by 100 || divisible by 400).
//		8️⃣ Verify if a triangle is valid (a + b > c && b + c > a && a + c > b).
//		9️⃣ Validate if a character is a vowel (a, e, i, o, u).
//		🔟 Check if a student qualifies for scholarship (marks ≥ 85 or sports participation = true).
//
//		🔴 Advanced Level
//
//		11️⃣ Check login validation (username == "admin" && password == "1234").
//		12️⃣ Verify if a point (x, y) lies inside a rectangle defined by (x1, y1) and (x2, y2).
//		13️⃣ Determine if a person qualifies for loan based on age, salary, and credit score.
//		14️⃣ Check if a number is a multiple of both 2 and 3 but not of 5.
//		15️⃣ Simulate a security gate: grant entry only if (card swiped and pin correct) or (admin override).
	}

}
