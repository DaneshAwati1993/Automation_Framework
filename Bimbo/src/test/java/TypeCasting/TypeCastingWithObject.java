package TypeCasting;

class parent
{
	String name="Danesh";
	void method()
	{
		System.out.println("Parent Method");
	}
}

class child extends parent
{
	int a=1000;
	String name1="Anand";
	void method1()
	{
		System.out.println("Parent Method");
	}
}

public class TypeCastingWithObject {

	public static void main(String[] args) {
		
		child ch=new child();
		ch.method();
		ch.method1();
		System.out.println(ch.name);
		System.out.println(ch.name1);
		
		//Up Casting : 
		parent P=new child();
		P.method();						//Parent
		//System.out.println(P.a);		//Child
		//P.method1();
		
		//DOwn casting : 
		child ch1=(child) new parent();
		ch1.method();
		System.out.println(ch1.name);
		ch1.method1();
		System.out.println(ch1.name1);
		System.out.println(ch1.a);
		
	}

}
