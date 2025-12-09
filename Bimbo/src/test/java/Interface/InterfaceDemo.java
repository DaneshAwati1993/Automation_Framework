package Interface;

interface book
{
	int noOfPages=100;			//final static
	String Author="Danesh";
	
	void method1();				//Abstract Method
	default void method2()
	{
		System.out.println("Default Method");
	}
	
	static void method3()
	{
		System.out.println("Static Method");
	}
}

public class InterfaceDemo implements book {
	
	public void method1()
	{
		System.out.println("Abstarct Method");
	}
	
	void method4(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {

		//Case 1 : 
		/*
		InterfaceDemo ifd=new InterfaceDemo();
		
		ifd.method1();		//Abstarct method implemneted
		ifd.method2();		//Default method Interafce
		book.method3();		//Using Interface we can call this static method
		*/
		
		//Case 2 :	Using the interface reference to call the child Object
		
		//book bk=new book();				//Not allow to Create Object as book is interface
			
		book bk=new InterfaceDemo();
	
		bk.method1();
		bk.method2();
		book.method3();

		InterfaceDemo ifd=new InterfaceDemo();
		ifd.method1();
		ifd.method2();
		ifd.method4("Danesh");
	}
	

}
