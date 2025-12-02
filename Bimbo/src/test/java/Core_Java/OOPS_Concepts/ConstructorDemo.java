package Core_Java.OOPS_Concepts;

public class ConstructorDemo {
	
	//variable 

	int a;
	int b;
	
	ConstructorDemo(){
		
		a=100;
		b=200;
		
	}
	
	ConstructorDemo(int x, int y){
		
		a=x;
		b=y;
		
	}
	void sum(){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		//Default Constructors
		ConstructorDemo cd1=new ConstructorDemo();
		cd1.sum();
		
		//Parameterized Constructors
		ConstructorDemo cd2=new ConstructorDemo(300,400);
		cd2.sum();

		
		
	}

}
