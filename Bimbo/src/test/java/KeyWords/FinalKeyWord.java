package KeyWords;

final class TestClass12
{
	int a = 1000;
	
	final void display()
	{
		System.out.println("Parent Display Method");
	}
}

class TestClass13 extends TestClass12		//Final keyword assigned Class can't be inheritance
{
	final int a = 1000;
	
	void display()				//Final keyword assigned method can't be Override
	{
		System.out.println("Child Display Method");
	}
}



public class FinalKeyWord {

	public static void main(String[] args) {

		TestClass12 TC=new TestClass12();
		
		System.out.println(TC.a);
		
		TC.a=2500;
		System.out.println(TC.a);
		
		TestClass13 TC13=new TestClass13();
		
		System.out.println(TC13.a);
		
		//TC13.a=2500;								//Final key specified variable cannot be change further.
		
		
		

	}

}
