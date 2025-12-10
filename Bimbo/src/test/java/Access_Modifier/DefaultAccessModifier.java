package Access_Modifier;

public class DefaultAccessModifier {
	
	int b=200;
	void method1()
	{
		System.out.println("Default Access Modifier");
	}
	

	public static void main(String[] args) {
		
		DefaultAccessModifier DVM=new DefaultAccessModifier();
		System.out.println(DVM.b);
		DVM.method1();
	}

}
