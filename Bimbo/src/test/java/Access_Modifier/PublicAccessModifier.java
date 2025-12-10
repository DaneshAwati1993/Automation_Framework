package Access_Modifier;

public class PublicAccessModifier {
	
	public int d=400;
	public void method3(String str1, String str2)
	{
		System.out.println(str1+str2);
	}

	public static void main(String[] args) {

		PublicAccessModifier PBVM=new PublicAccessModifier();
		System.out.println(PBVM.d);
		PBVM.method3("Danesh", "Awati");
	}

}
