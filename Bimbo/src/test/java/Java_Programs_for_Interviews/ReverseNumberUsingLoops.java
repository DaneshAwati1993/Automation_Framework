package Java_Programs_for_Interviews;

public class ReverseNumberUsingLoops {

	public static void main(String[] args) {

		int n=12345;
		System.out.println("Input Value : "+n);
		int rem=0 , rev=0;
		System.out.println("Using For Loops : \n------------------------------");

		for (; n!=0;n=n/10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		System.out.println("Reversed Values is : "+rev);
		
		System.out.println("Using While Loops : \n------------------------------");

		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println("Reversed Values is : "+rev);
		
		System.out.println("Using While Loops : \n------------------------------");
		int sum=0;
		int n1=12345;
		while(n1!=0)
		{
			sum=sum+n1%10;
			n1=n1/10;
		}
		System.out.println("Reversed Values is : "+sum);
	}

}
