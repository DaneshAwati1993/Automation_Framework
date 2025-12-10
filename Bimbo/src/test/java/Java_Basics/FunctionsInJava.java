package Java_Basics;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava F = new FunctionsInJava();
		F.test();
		int l=F.pqr();
		System.out.println(l);
		String s1=F.qa();
		System.out.println(s1);
		int m=F.division(30, 10);
		System.out.println(m);
	}

	
	public void test()
	{
		System.out.println("PrivateAccessModifier Method");
	}
	
	public int pqr()
	{
		System.out.println("pqr Method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String qa()
	{
		System.out.println("String Mthod");
		String s="Selenioum with Java";
		return s;
	}
	
	public  int division(int x, int y)
	{
		System.out.println("Division Method");
		int d=x/y;
		return d;
		
		
	}
}
