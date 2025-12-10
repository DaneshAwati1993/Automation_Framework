package Access_Modifier;

public class TestClass {

	public static void main(String[] args) {

		/*
		PrivateAccessModifier PVM=new PrivateAccessModifier();
		PVM.a;		//Private Variable not visible outside class
		PVM.method();	//Private method not visible outside class
		*/
		
		DefaultAccessModifier DVM=new DefaultAccessModifier();
		System.out.println(DVM.b);
		DVM.method1();
		

		ProtectedAccessModifier PRVM=new ProtectedAccessModifier();
		System.out.println(PRVM.c);
		PRVM.method2();
		

		PublicAccessModifier PBVM=new PublicAccessModifier();
		System.out.println(PBVM.d);
		PBVM.method3("Danesh", "Vijayapur");
	}

}
