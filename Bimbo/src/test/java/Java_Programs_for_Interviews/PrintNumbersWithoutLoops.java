package Java_Programs_for_Interviews;

public class PrintNumbersWithoutLoops {

	//Print Numbers 1 to 10 without using loops //Using Recursion
	public static void main(String[] args) {

		int n=10;
		printNumbers(n);
	}
	
	public static void printNumbers(int n)
	{
		if(n<1)
			return;
		printNumbers(n-1);
		System.out.println(n);
	}

}
