package Core_Java;

public class PatternsPrinting {

	public static void main(String[] args) {

		System.out.println("Number Pattern Printing     \n----------------------------------------------");
		
		int num=5;
		
		System.out.println("Pattern  - 1 : \n----------------");
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 2 : \n----------------");
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 3 : \n----------------");
		//Odd number print as per number and Even should print only once.
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if (i%2==0)
				{
					System.out.print(i);
					break;
				}
				else
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 4 : \n----------------");
		//Even number print as per number and Odd should print only once.
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if (i%2!=0)
				{
					System.out.print(i);
					break;
				}
				else
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 5 -incremental count : \n--------------------------------------");
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 5 -Decremental count : \n--------------------------------------");
		
		for(int i=num; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 5 -Left Allign : \n--------------------------------------");
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern  - 5 -combination of inverted triangles : \n--------------------------------------------------------");

		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
