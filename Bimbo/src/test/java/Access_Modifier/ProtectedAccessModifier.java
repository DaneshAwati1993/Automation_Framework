package Access_Modifier;

public class ProtectedAccessModifier {
	
	protected int c=300;
	protected void method2()
	{
		System.out.println("Protected Access Modifiers..........");
	}

	public static void main(String[] args) {

		ProtectedAccessModifier PRVM=new ProtectedAccessModifier();
		System.out.println(PRVM.c);
		PRVM.method2();
	}

}
