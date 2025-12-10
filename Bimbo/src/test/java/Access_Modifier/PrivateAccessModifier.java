package Access_Modifier;

public class PrivateAccessModifier {
	
	private int a=100;		//Private Variable not visible outside class
	private void method()	//Private method not visible outside class
	{
		System.out.println("Private Access Modifiers......");
	}
	
	public static void main(String[] args) {
		
		PrivateAccessModifier PVM=new PrivateAccessModifier();
		System.out.println(PVM.a);
		PVM.method();
		
	}

}
