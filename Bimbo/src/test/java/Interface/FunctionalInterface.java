package Interface;

interface FuncInterafce
{
	void method();
	default void method1()
	{
		System.out.println("Default method1");
	}
	default void method2()
	{
		System.out.println("Default method2");
	}
	
	static void method3()
	{
		System.out.println("static method3");
	}
	static void method4()
	{
		System.out.println("static method4");
	}
	
}

public class FunctionalInterface implements FuncInterafce {

	public static void main(String[] args) {
		FunctionalInterface FIN=new FunctionalInterface();
		FIN.method();
		FIN.method1();
		FIN.method2();
		FuncInterafce.method3();
		FuncInterafce.method4();
	}

	@Override
	public void method() {
		System.out.println("Abstarct method -  Functioanl Interface");		
	}

}
