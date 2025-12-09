package Interface;

abstract class Test
{
	//Static, Non-Static veriable and method
	//Abstract methods and Non-Abstarct methods
	
	abstract void method();		//abstract method
}

public class Class1 extends Test{

	public static void main(String[] args) {
		
		Class1 cl1=new Class1();
		cl1.method();

	}
	@Override
	void method()
	{
		System.out.println("Abstract Method - Abstract class example");
	}

}
