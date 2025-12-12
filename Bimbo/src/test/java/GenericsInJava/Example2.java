package GenericsInJava;

class Test<T1,T2>
{
	T1 value;
	T2 Id;
}

public class Example2 {

	public static void main(String[] args) {
		
		Test<Integer, String> obj=new Test<>();
		obj.Id="Danesh";
		obj.value=123;
	}

}
