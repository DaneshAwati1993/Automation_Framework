package Java_Basics;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj=new MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(15, 25);
				
	}
	
	// Same Method but have different params with different data type is called Method Overloading
	public void sum()
	{
		System.out.println("Sum method with no Params.......");
	}
	
	public void sum(int i)
	{
		System.out.println("Sum method with 1 Params.......");
		System.out.println(i);
	}
	
	public void sum(int k, int j)
	{
		System.out.println("Sum method with 2 Params.......");
		System.out.println(j+k);
	}
}
