package Interface;

//Multiple Inheritance using two Interfaces
public class TestClass implements Interface1, Interface2 {

	public static void main(String[] args) {

		TestClass tc=new TestClass();
		tc.method1();
		tc.method2();
		System.out.println(tc.a);
		System.out.println(tc.b);
	}

	@Override
	public void method1() {
		System.out.println("Method1 from Interafce1");
		
	}

	@Override
	public void method2() {

		System.out.println("Method2 from Interafce2");
	}

}
