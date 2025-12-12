package GenericsInJava;

class Containers<T>
{
	T value;
	T Id;
	T Key;
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Containers<Integer> obj=new Containers<>();
		obj.value=123;
		obj.Id=234;
		obj.Key=12345;
		
		Containers<String> obj1=new Containers<>();
		obj1.value="Danesh";
		obj1.Id="Awati";
		obj1.Key="Vijaypur";
		
	}

}
