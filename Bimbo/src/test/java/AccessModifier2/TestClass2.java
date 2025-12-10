package AccessModifier2;

import Access_Modifier.DefaultAccessModifier;
import Access_Modifier.ProtectedAccessModifier;
import Access_Modifier.PublicAccessModifier;

public class TestClass2 extends ProtectedAccessModifier {

	public static void main(String[] args) {

		/*
		DefaultAccessModifier DVM=new DefaultAccessModifier();
		System.out.println(DVM.b);		//Default veriables are not visible outside the Package
		DVM.method1();					//Default methods are not visible outside the Package
		*/
		

		TestClass2 PRVM1=new TestClass2();
		System.out.println(PRVM1.c);
		PRVM1.method2();
		
		PublicAccessModifier PBVM=new PublicAccessModifier();
		System.out.println(PBVM.d);
		PBVM.method3("Danesh", "Karnataka");
	}

}
